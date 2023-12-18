
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double ans = 0;
		for(int i = 1; i <= n; i++) {
			double tmp = 0.5;
			double pow  = 0d;
			int j = i;
			while(j < k) {
				pow += 1;
				j *= 2;
			}
			ans += Math.pow(tmp, pow) * 1/n ;
		}
		System.out.println(ans);
		sc.close();
	}
}
