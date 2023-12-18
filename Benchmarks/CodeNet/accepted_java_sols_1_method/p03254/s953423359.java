import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ame = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			ame -= arr[i];
			if (ame >= 0) {
				cnt++;
			} else {
				break;
			}
		}

		if (ame > 0) {
			cnt--;
		}
		System.out.println(cnt);
	}
}