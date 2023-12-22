import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++) v[i] = sc.nextInt();
		sc.close();

		//処理
		Arrays.sort(v);
		double ans = (double)(v[0] + v[1])/2;
		for(int i = 2; i < n; i++){
			ans = (ans + v[i])/2;
		}

		//出力
		System.out.println(ans);
	}
}
