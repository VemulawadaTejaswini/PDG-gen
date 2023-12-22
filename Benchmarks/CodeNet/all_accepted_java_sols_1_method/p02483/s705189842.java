import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[3];
		for (int i = 0; i < 3; i++) {
			in[i] = sc.nextInt();
		}
		Arrays.sort(in);
		for (int i = 0; i < 2; i++) {
			System.out.print(in[i] + " ");
		}
		System.out.println(in[2]);
	}
}