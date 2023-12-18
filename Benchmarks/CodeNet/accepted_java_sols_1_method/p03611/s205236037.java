import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = 0;
		int min = 100000;
		int max = 0;
		int[] all = new int[100001];
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = reader.nextInt();
			all[arr[i]]++;
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		for (int i = min; i <= max; i++) {
			int tmp = all[i];
			if (i > 0) {
				tmp += all[i-1];
			}
			if (i < 100000) {
				tmp += all[i+1];
			}
			ans = Math.max(tmp, ans);
		}

		System.out.println(ans);
		reader.close();

	}
}



