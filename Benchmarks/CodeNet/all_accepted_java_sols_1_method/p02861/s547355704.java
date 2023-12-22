
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double masu[][]=new double[2][n];
		for(int i=0;i<n;i++) {
			masu[0][i]=sc.nextDouble();
			masu[1][i]=sc.nextDouble();
		}

		double g=0;
		int c=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				double b=Math.sqrt((Math.pow((double)masu[0][i]-masu[0][j],2))+(Math.pow((double)masu[1][i]-masu[1][j], 2)));
				g+=b;
				c++;
			}
		}
		double ans=g/c*(n-1);
		System.out.println(ans);
	}

}