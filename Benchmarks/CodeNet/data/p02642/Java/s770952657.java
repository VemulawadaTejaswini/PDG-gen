import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		boolean[] check = new boolean[A[N-1]+1]; // 数列に含まれる最大値まで判定用の配列を用意
		Arrays.fill(check, true);
		int ans = 0;
		
		// 小さい順から、割り切れるか判定していく
		for (int i = 0; i < N; i++) {
			// 数列の次の値が自身と同じではなく、自身の約数が数列に存在していなければ、カウントを増やす
			if (A[i + 1] != A[i] && check[A[i]]) {
				ans++;
			}
			// 自分が割り切ることのできる数（自分の倍数）について、判定用の数列をfalseにする
			for (int j = A[i]; j <= A[N - 1]; j += A[i]) {
				check[j] = false;
			}
		}
		System.out.println(ans);



	}
}
