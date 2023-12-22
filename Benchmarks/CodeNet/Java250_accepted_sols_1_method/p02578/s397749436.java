import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextLong();
		}
		long total = 0;
		long must = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] < must) {
				total += must - arr[i];
				arr[i] = must;
			}
			must = arr[i];
		}
		System.out.println(total);
		reader.close();
	}
	
}
