import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());
		StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[len];
		int i = 0;
		while (tokenizer.hasMoreElements()) {
			arr[i++] = Integer.parseInt((String) tokenizer.nextElement());
		}

		sort(arr);
	}

	public static void sort(int[] arr) {
		printArr(arr);

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j >= 1; j--) {
				int current = arr[j];
				int prev = arr[j - 1];
				
				if (current < prev) {
					swap(arr, j - 1, j);
				} else {
					break;
				}
			}
			
			printArr(arr);
		}
	}
	
	public static void swap(int[] arr, int from, int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}
	
	public static void printArr(int[] arr) {
		String msg = "";
		for (int i = 0; i < arr.length; i++) {
			msg += arr[i];
			if (i == arr.length - 1) {
				break;
			}
			msg += " ";
		}
		System.out.println(msg);
	}

}