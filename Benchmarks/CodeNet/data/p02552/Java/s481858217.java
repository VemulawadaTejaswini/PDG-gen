
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] t = sc.nextLine().split(" ");
		long n = Long.parseLong(t[0]);
		long min = n == 0 ? 1 : 0;
		System.out.println(min);
	}
}
