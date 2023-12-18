import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int[] arr = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < K; i++) {
			ans+=arr[i];
		}
		System.out.println(ans);
	}
}