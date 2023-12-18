import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int diff = b - a;
		int length = 0;
		for (int i = 0; i <= diff; i++) {
			length += i;
		}
		System.out.println(length - b);
		sc.close();
	}
}