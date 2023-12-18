import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		long ret = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				ret += (long) arr[i] * (long) arr[j];
				ret %= Math.pow(10, 9) + 7;
			}
		}
		System.out.println(ret);
		reader.close();
	}
	
}
