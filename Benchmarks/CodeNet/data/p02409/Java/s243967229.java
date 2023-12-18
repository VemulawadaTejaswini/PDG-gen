import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][][] = new int[4][3][10];
		int b, f, r;
		for( b=0; b<4; b++ ){
			for( f=0; f<3; f++ ){
				for( r=0; r<10; r++ ){
					a[b][f][r] = 0;
				}
			}
		}
		for( int i=0; i<n; i++ ){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			a[b-1][f-1][r-1] = sc.nextInt();
			
		}
		for( b=0; b<4; b++ ){
			for( f=0; f<3; f++ ){
				for( r=0; r<10; r++ ){
					System.out.print( " " + a[b][f][r] );
				}
				System.out.println();
			}
			if( b != 3 ){
				System.out.println( "####################");
			}
		}
	}
}