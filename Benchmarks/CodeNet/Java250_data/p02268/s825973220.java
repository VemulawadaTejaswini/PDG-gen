import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		
		int q = Integer.parseInt(reader.readLine());
		strArray = reader.readLine().split(" ");
		int ans = 0;
		for (int i = 0; i < q; i++) {
			ans += binarySearch(arr, Integer.parseInt(strArray[i]));
		}
		System.out.println(ans);		
	}
	
	public static int binarySearch(int[] arr, int target) {
		
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int n = arr.length;
		
		int floor = 0;
		int ceiling = n - 1;
		
		while (floor <= ceiling) {
			int guessIdx = floor + (ceiling - floor) / 2;
			int guessValue = arr[guessIdx];
			if (guessValue == target) {
				return 1;
			}
			if (guessValue < target) {
				floor = guessIdx + 1;
			} else {
				ceiling = guessIdx - 1;
			}
		}
		return 0;
	}
}
