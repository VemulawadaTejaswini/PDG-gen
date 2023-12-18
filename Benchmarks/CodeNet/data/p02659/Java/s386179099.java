import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String b = sc.next();
		b = b.replace(".", "");
		long b100 = Long.parseLong(b);
		long answer = a * b100;
		System.out.println(answer/100);
	}

}