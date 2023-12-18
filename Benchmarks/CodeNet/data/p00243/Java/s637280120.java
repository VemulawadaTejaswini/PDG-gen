import java.util.Scanner;

public class Main{
	Scanner sc;
	int INF = 1<<27;
	
	int x, y;
	boolean done[][];
	byte[][] map;
	
	int search( int cnt, int sum, byte c ){
		if( sum == y*x ){
			return cnt;
		}
		
		int ans = INF;
		
		byte[][] dup = new byte[y][x];
		for( int j = 0; j < y; ++j ){
			for( int k = 0; k < x; ++k ){
				dup[j][k] = map[j][k];
			}
		}
		
		for( byte i = 0; i < 3; ++i ){
			if( i == c )continue;
			
			done = new boolean[y][x];
			int res = fill( i, 0, 0, c );
			
			if( res != sum ){
				ans = Math.min( ans, search( cnt + 1, res, i ) );
			}
			
			for( int j = 0; j < y; ++j ){
				for( int k = 0; k < x; ++k ){
					map[j][k] = dup[j][k];
				}
			}
		}
		
		return ans;
	}
	
	void run(){
		sc = new Scanner(System.in);
		
		while(true){
			x = ni();
			y = ni();
			if( (x|y) == 0 ){
				break;
			}
			
			map = new byte[y][x];
			for( int i = 0; i < y; ++i ){
				for( int j = 0; j < x; ++j ){
					map[ i ][ j ] = nc();
				}
			}
			
			done = new boolean[y][x];
			int cnt = count( map[0][0], 0, 0 );
			
			System.out.println( search( 0, cnt, map[0][0] ) );
		}
		
		sc.close();
	}
	
	int[][] ofs = { {0,1}, {1,0} };
	int count( byte color, int y, int x ){
		if( x >= this.x || y >= this.y )return 0;
		if(done[y][x])return 0;

		int cnt = 0;
		if( map[y][x] == color ){
			++cnt;
			done[y][x] = true;
			for( int i = 0; i < 2; ++i ){
				cnt += count( color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ] );
			}			
		}
		
		return cnt;
	}
	int count( byte color, int y, int x, byte trg, boolean flag ){
		if( x >= this.x || y >= this.y )return 0;
		if(done[y][x])return 0;

		int cnt = 0;
		if( !flag && map[y][x] == color ){
			++cnt;
			done[y][x] = true;
			for( int i = 0; i < 2; ++i ){
				cnt += count( color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ], trg, false );
			}			
		}else{
			if( map[y][x] == trg ){
				++cnt;
				done[y][x] = true;
				for( int i = 0; i < 2; ++i){
					cnt += count( color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ], trg, true );
				}
			}
		}
		
		return cnt;
	}
	
	int fill( byte color, int y, int x, byte trg ){
		if( x >= this.x || y >= this.y )return 0;
		if(done[y][x])return 0;
		
		int cnt = 0;
		
		if(map[y][x] == trg){
			map[y][x] = color;
			done[y][x] = true;
			++cnt;
			
			for( int i = 0; i < 2; ++i ){
				cnt += fill( color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ], trg );
			}
		}else{
			if(map[y][x] == color){
				done[y][x] = true;
				++cnt;
				
				for( int i = 0; i < 2; ++i ){
					cnt += fill( color, y + ofs[ i ][ 1 ], x + ofs[ i ][ 0 ], color );
				}
			}
		}
		
		return cnt;
	}
	
	int ni(){ return sc.nextInt(); }
	byte nc(){
		switch(sc.next().charAt(0)){
		case 'R' : return 0;
		case 'G' : return 1;
		case 'B' : return 2;
		default : return -1;
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
}