import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		long a = Long.parseLong(input[0]);
		double b = Double.parseDouble(input[1]);
		System.out.println((long) (a * b));
		sc.close();
	}
}
