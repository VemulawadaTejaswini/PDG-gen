import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long N = reader.nextLong();
		long[] arr = new long[5];
		int minIndex = 0;
		long ans = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = reader.nextLong();
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		long length = N / arr[minIndex];
		if (N % arr[minIndex] != 0) {
			length++;
		}
		ans = length - 1 + 5;

		System.out.print(ans);
		reader.close();
	}
}



