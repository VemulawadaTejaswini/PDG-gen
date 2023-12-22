import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int s[][] = new int[r][c];
		int cg[] = new int[c];
		int rg;
		int i,j;
		for( i=0; i<r; i++ ){
			for( j=0; j<c; j++ ){
				s[i][j] = sc.nextInt();
			}
		}
		for( j=0; j<c; j++ ){
			cg[j] = 0;
		}
		for( i=0; i<r; i++ ){
			for( j=0, rg=0; j<c; j++ ){
				System.out.print( s[i][j] + " " );
				cg[j] += s[i][j];
				rg += s[i][j];
			}
			System.out.println( rg );
		}
		for( j=0, rg=0; j<c; j++ ){
			System.out.print( cg[j] + " " );
			rg += cg[j];
		}
		System.out.println( rg );
	}
}