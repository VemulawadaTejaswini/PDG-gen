import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.parallelSort(arr);
		int ans = 0;
		for (int i = 0; i < k; i++) {
			ans = ans + arr[i];
		}
		System.out.println(ans);

	}

}
