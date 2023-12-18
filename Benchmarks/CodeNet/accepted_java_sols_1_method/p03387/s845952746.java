import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = arr[2] - arr[1];
		arr[0] += count;
		count += (arr[2] - arr[0]) / 2;
		if ((arr[2] - arr[0]) % 2 == 1) {
		    count += 2;
		}
		System.out.println(count);
	}
}
