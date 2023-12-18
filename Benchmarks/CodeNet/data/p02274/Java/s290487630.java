import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(strArray[i]);
			arr2[i] = Integer.parseInt(strArray[i]);
		}
		
		int cnt = bubbleSort(arr1);
		System.out.println(cnt);
	}

	private static int bubbleSort(int[] arr) {
		int cnt = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i + 1; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	
}

