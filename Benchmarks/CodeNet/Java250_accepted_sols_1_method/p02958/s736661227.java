import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc135/tasks/abc135_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arrayN = new int[N];
		for(int i = 0;i<N;i++) {
			arrayN[i] = sc.nextInt();
		}
		sc.close();

		int[] sortArrayN = arrayN.clone();
		Arrays.sort(sortArrayN);

		int ans = 0;
		for(int i=0;i<arrayN.length;i++) {
			if(arrayN[i]!=sortArrayN[i]) {
				ans++;
			}
		}

		if(ans>2) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}

	}

}
