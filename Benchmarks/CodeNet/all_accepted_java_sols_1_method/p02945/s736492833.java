import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int cal[] = new int[3];

		cal[0] = A+B;
		cal[1] = A-B;
		cal[2] = A*B;

		Arrays.sort(cal);
		System.out.println(cal[2]);
	}
}
