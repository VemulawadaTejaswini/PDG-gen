import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] nums = new int[100001]; 
		long sum = 0;
		for(int i = 0; i < length; i++) {
			int temporal = scanner.nextInt();
			nums[temporal]++;
			sum += temporal;
		}
		int q = scanner.nextInt();
		for(int i = 0; i < q; i++) {
			int replace = scanner.nextInt();
			int newNum = scanner.nextInt();
			nums[newNum] += nums[replace];
			sum += nums[replace] * (newNum - replace);
			nums[replace] = 0;
			System.out.println(sum);
		}
	}
}
