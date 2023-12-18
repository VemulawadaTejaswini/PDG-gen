import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		System.out.println((int) (a + Math.pow(a, 2) + Math.pow(a, 3)));
	}
}
