import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int p[] = new int[N];

		for(int i = 0;i<N;i++) {
			p[i]= sc.nextInt();
		}

		Arrays.sort(p);
		int ans = 0;

		for(int i = 0;i<K;i++) {
			ans=ans+p[i];
		}
		System.out.println(ans);
	}

}
