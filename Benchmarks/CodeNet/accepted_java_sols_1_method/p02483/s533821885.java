import java.util.Scanner;

class Main{
	public static void main( String[] args ){
		Scanner stdin = new Scanner( System.in );
		int[] x = new int[3];
		for( int i=0; i<3; i++ ){
			x[i] = stdin.nextInt();
		}
		for( int i=0; i<2; i++ ){
			for( int j=2; j>i; j-- ){
				if( x[j] < x[j-1] ){
					int tmp = x[j];
					x[j] = x[j-1];
					x[j-1] = tmp;
				}
			}
		}
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
	}
}