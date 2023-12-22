import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int total = 0;
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		int k = sc.nextInt();
		Arrays.sort(arr);
		int max = arr[2];
		long dob = arr[2];
		for (int i = 0; i < k; i++) {
			dob *= 2;
		}
		System.out.println(total - max + dob);
	}
}
