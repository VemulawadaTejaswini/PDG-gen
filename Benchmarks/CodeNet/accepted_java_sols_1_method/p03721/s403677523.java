import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long K = input.nextLong();
		long ans = 0;
		long[][] arr = new long[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		Arrays.sort(arr,(a,b)->Long.compare(a[0],b[0]));
		for (int i = 0; i < N; i++) {
			ans = arr[i][0];
			K-=arr[i][1];
			if (K<=0) break;
		}
		System.out.println(ans);
	}
}