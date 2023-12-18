import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long x = scanner.nextLong();

		long bx = b/x;
		long ax = a/x;
		if(a%x==0) ax--;
		System.out.println(bx-ax);
		scanner.close();
	}

}
