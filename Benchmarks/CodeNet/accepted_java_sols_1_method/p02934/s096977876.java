import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = 0.0;
		for(int i = 0; i < n; ++i){
			int a = sc.nextInt();
			double tmp = 1.0 / (double)a;
			ans += tmp;
		}
		sc.close();
		ans = 1.0 / ans;
		System.out.println(ans);
	}
}
