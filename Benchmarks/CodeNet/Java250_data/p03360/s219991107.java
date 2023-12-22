import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
		Arrays.sort(array);
		int K = sc.nextInt();
		System.out.println((int)(array[2] * Math.pow(2, K)) + array[1] + array[0]);
	}
}