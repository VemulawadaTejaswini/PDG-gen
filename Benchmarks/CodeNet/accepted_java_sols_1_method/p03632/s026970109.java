import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int[] arr = new int[1000];
		int a = sc.nextInt(), b= sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		arr[a]++;
		arr[b]--;
		arr[c]++;
		arr[d]--;
		Arrays.parallelPrefix(arr, Integer::sum);
		long ans = Arrays.stream(arr).filter(i -> i==2).count();
		System.out.println(ans);
	}
}