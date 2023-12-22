import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int d=scan.nextInt();
		int x[][]=new int[n][d];
		for(int i=0;i<n;i++) {
			for(int j=0;j<d;j++) {
				x[i][j]=scan.nextInt();
			}
		}
		scan.close();

		int cnt=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int a =0;
				for(int k=0;k<d;k++) {
					a+= (x[i][k]-x[j][k])*(x[i][k]-x[j][k]) ;
				}
				if(Math.sqrt(a) == (int)Math.sqrt(a) ) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
