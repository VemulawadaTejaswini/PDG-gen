import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		@SuppressWarnings("resource")
		Scanner cd = new Scanner(System.in);
		int d = cd.nextInt();
		long n = cd.nextInt();
		long ans=0;
		if(d==0) {
			if(n==100) {
				ans=101;
			}
			else{
				ans=n;
			}
		}
		else if(d==1) {
			if(n==100) {
				ans = 10100;
			}
			else{
				ans=100*n;
			}
		}
		else if(d==2) {
			if(n==100) {
				ans = 1010000;
			}
			else{
				ans= 10000*n;
			}
		}

		System.out.println(ans);
	}

}
