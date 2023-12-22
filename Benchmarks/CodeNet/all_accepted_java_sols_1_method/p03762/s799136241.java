import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		//N
		int m = sc.nextInt();		//M
		long[] x = new long[n];		//値を保管する
		long[] y = new long[m];		//値を保管する
		for(int i=0;i<n;i++) {
			x[i] = sc.nextLong();
		}
		for(int i=0;i<m;i++) {
			y[i] = sc.nextLong();
		}
		long div =1_000_000_007;		//場合の数
		long xsum = 0;	//Xの合計
		for(int i=0;i<n;i++){
			xsum += (2*i-n+1)*x[i];
		}
		xsum %= div;
		long ysum = 0;
		for(int i=0;i<m;i++){
			ysum += (2*i-m+1)*y[i];
		}
		ysum %= div;
		long sum = xsum*ysum;
		System.out.println(sum%div);
	}
}