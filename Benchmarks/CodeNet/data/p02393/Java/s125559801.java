import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arrInt = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");

		int a = Integer.parseInt(arrInt[0]);
		int b = Integer.parseInt(arrInt[1]);
		int c = Integer.parseInt(arrInt[2]);

		int[] arr = new int[]{a, b, c};

		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}
}