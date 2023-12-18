
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();
		int k = s.nextInt();
		int ans = 0, count = 0;
		int curr = Integer.MIN_VALUE;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (curr + k < arr[i] || count >= c) {
				curr = arr[i];
				count = 1;
				ans++;
			}
			else{
				count++;
			}
			
		}
		System.out.println(ans);
	}

}