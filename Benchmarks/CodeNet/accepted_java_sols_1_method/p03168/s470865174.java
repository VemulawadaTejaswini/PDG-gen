
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][] ans = new double[n+1][n+1];
		ans[0][0]=1;
		for (int i=0;i<n;i++) {
			double p = sc.nextDouble();
			ans[i+1][0]=ans[i][0]*(1-p);
			for (int j=0;j<n;j++) {
				ans[i+1][j+1]=ans[i][j]*p+ans[i][j+1]*(1-p);
			}
		}
		
		double out = 0;
		for (int i=(n+1)/2;i<=n;i++) {
			out += ans[n][i];
		}
		System.out.println(out);
	}

}
