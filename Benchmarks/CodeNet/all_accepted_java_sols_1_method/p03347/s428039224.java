import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		int[] arr = new int[N];
		long ans = 0;
		boolean can = true;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (i == 0) {
				if (arr[i] != 0) can = false;
			} else {
				if (arr[i] > arr[i-1] + 1) can = false;
				if (arr[i] == arr[i-1] + 1) ans++;
				else ans += arr[i];
			}
			
		}
		System.out.println(can ? ans : -1);
	}
}
