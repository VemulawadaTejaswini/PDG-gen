import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextInt();
		long[]t = new long[N];
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();
		long cnt = T;
		long k = T;
		for(int i = 1; i < N; i++) {
			if(t[i] < k) {
				cnt -= (k - t[i]);
				k = t[i] + T;
				cnt += T;
			}else if(t[i] == k){
				cnt += T;
				k += T;
			}else if(t[i] > k) {
				cnt += T;
				k = t[i] + T;
			}
		}
		System.out.println(cnt);
	}
}