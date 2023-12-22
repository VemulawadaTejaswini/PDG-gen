import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] m = new int[N];

		int rem = X;
		int ans = 0;
		int minVal = 0;
		for (int i = 0; i < N; i++){
			m[i] = sc.nextInt();
			if (i == 0){ // 初回のみ
				minVal = m[i];
			}
			rem -= m[i];
			minVal = Math.min(minVal, m[i]);
			ans++;
		}

		ans += rem / minVal;

		System.out.println(ans);
	}
}
