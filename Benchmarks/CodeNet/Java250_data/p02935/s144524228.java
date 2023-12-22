import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		double result = arr[0];
		for (int i = 1; i < n; i++) {
			result = (result + arr[i]) / 2.0;
		}
		System.out.println(result);
	}
}
