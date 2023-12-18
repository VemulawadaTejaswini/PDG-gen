import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] data = { a, b, c };
		Arrays.sort(data);
		System.out.println(data[0] + " " + data[1] + " " + data[2]);
	}
}
