import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner sc;
	int INF = 1 << 28;
	
	int x, y;
	int[] field;
	
	int ans;
	void solve( int c, int depth, int cnt ){
		if( cnt == x*y ){
			ans = Math.min( ans, depth );
			return;
		}
		if( depth >= ans ) return;
		
		for( int i = 1; i <= 3; ++i ){
			if( c != i ){
				int[] dump = new int[10];
				for( int j = 0; j < 10; ++j ) dump[j] = field[j];
				
				done = new boolean[10][10];
//				debug("before");
//				for(int j = 0; j < y; ++j) debug(Integer.toBinaryString(field[j]&((1<<(2*x)) -1)));
				fill( 0, 0, i, c );
//				debug("after");
//				for(int j = 0; j < y; ++j) debug(Integer.toBinaryString(field[j]&((1<<(2*x)) -1)));
				debug();
				done = new boolean[10][10];
				int cnt_ = count( 0, 0, i );
				if( cnt_ == cnt ){
					for( int j = 0; j < 10; ++j ) field[j] = dump[j];
					continue;
				}
				solve( i, depth + 1, cnt_ );
				
				for( int j = 0; j < 10; ++j ) field[j] = dump[j];
			}
		}
	}
	
	int[] dx = { 1, 0 };
	int[] dy = { 0, 1 };
	
	boolean[][] done;
	void fill(int x, int y, int c, int from){
		if( done[x][y] )return;
		if( x >= this.x )return;
		if( y >= this.y )return;
		if( (field[ y ]>>(x*2) & 3) != from )return;
		
		field[ y ] &= ~((3)<<(x*2));
		field[ y ] |= (c)<<(x*2);
		
		done[x][y] = true;
		
		for( int i = 0; i < 2; ++i ){
			fill( x + dx[i], y + dy[i], c, from );
		}
	}
	int count( int x, int y, int c ){
		if( done[x][y] )return 0;
		if( x >= this.x )return 0;
		if( y >= this.y )return 0;
		if( (field[ y ]>>(x*2) & 3) != c )return 0;
		
		done[x][y] = true;
		
		int cnt = 1;
		for( int i = 0; i < 2; ++i ){
			cnt += count( x + dx[i], y + dy[i], c );
		}
		
		return cnt;
	}
	
	void run(){
		sc = new Scanner(System.in);
		
		while(true){
			x = ni();
			y = ni();
			
			if( (x|y) == 0 ) break;
			
			field = new int[10];
			
			for( int i = 0; i < y; ++i ){
				field[ i ] = 0;
				for( int j = 0; j < x; ++j ){
					field[ i ] |= nc() << (j*2);
				}
			}
			
			ans = INF;
			solve( field[0] & 3, 0, 0 );
			
			System.out.println(ans);
		}
		
		sc.close();
	}
	
	int ni(){ return Integer.parseInt(sc.next()); }
	int nc(){
		char c = sc.next().charAt(0);
		
		switch(c){
		case 'R': return 1;
		case 'G': return 2;
		case 'B': return 3;
		default : return 0;
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}