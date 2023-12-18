import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,x,g;
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			if( n==0 && x==0 ) break;
			g = 0;
			for( int i=1; i<=n-2; i++ ){
				for( int j=2; j<=n-1; j++ ){
					for( int k=3; k<=n; k++ ){
						if( i>=j || i>=k || j>=k ) continue;
						if( i+j+k==x ) g++;
					}
				}
			}
			System.out.println( g );
		}
	}
}