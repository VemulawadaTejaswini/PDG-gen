import java.util.*;

class Main{
	static int MOD = 1000000007;
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		//処理
		long ans = 1;
		for(int i = 1; i<= n; i++){
			ans *= i;
			ans %= MOD;
		}

		//出力
		System.out.println(ans);
	}
}
