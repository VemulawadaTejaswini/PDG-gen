import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		int []k = new int[3];
		k[0] = A + B;
		k[1] = A - B;
		k[2] = A * B;
		Arrays.sort(k);
		System.out.println(k[2]);

	}
}