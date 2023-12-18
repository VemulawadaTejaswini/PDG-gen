import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		scan.close();
		int max = 10 * A + B + C;
		max = Math.max(max, 10 * B + A + C);
		max = Math.max(max, 10 * C + A + B);
		System.out.println(max);
	}
}