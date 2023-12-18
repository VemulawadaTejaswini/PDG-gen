import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		long L[] = new long[N];
		for(int i=0; i<N; i++) {
			L[i] = sc.nextLong();
		}

		int ans = 0;

		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(L[i] == L[j]) {
					continue;
				}
				for(int k=j+1; k<N; k++) {
					if(L[i] == L[k] || L[j] == L[k]) {
						continue;
					}
					if(L[i]+L[j]>L[k] && L[j]+L[k]>L[i] &&L [k]+L[i]>L[j]) {
						ans++;
					}
				}
			}
		}
		// 出力
		System.out.println(ans);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
