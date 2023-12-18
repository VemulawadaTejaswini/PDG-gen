import java.util.Scanner;

class Main {
	int m, n;
	char[][] arr = new char[10][10];
	void saiki( char x, int i, int j ) {
		//???
		if( i-1 >= 0 ) {
			char arrn = arr[i-1][j];
			if( arrn == x ) {
				arr[i-1][j] = '1';
				saiki( x, i-1, j );
			}
		}
		//???
		if( i+1 < m ) {
			char arrs = arr[i+1][j];
			if( arrs == x ) {
				arr[i+1][j] = '1';
				saiki( x, i+1, j );
			}
		}
		//???
		if( j-1 >= 0) {
			char arrw = arr[i][j-1];
			if( arrw == x ) {
				arr[i][j-1] = '1';
				saiki( x, i, j-1 );
			}
		}	
		//???
		if( j+1 < n ){
			char arre = arr[i][j+1];
			if( arre == x ) {
				arr[i][j+1] = '1';
				saiki( x, i, j+1 );
			}
		}
	}

	void run() {
		for( ; ; ) {
			//?????°
			int sum = 0;
			//??????????????????
			Scanner scan = new Scanner(System.in);
			m = scan.nextInt();
			n = scan.nextInt();
			if( m == 0 && n == 0) break;
			for( int i = 0; i < m; i++ ) {
				arr[i] = scan.next().toCharArray();
			}
			
			
			for( int i = 0; i < m; i++ ) {
				for( int j = 0; j < n; j++ ) {
					if( arr[i][j] == '1' ) continue;
					char tmp = arr[i][j];
					arr[i][j] = '1';
					sum++;
					saiki( tmp, i, j );
				}
			}
			
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		new Main().run(); 
	}
}