import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		double ans = 0;

		//ダイス分回す
		for(int i = 1; i<= N; i++) {
			//確率
			double p = 1;
			//ダイスの目
			int x = i;
			//スコアが目標得点より小さい場合
			while(x < K) {
				p *= 0.5;
				x *= 2;
			}
			ans += p;
		}
		System.out.println(ans/N);
	}
}