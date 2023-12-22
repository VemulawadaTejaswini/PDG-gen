import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		for (int i = a; i < Math.min(a + k, b + 1); i++)
			System.out.println(i);
		for (int i = Math.max(a + k, b - k + 1); i <= b; i++)
			System.out.println(i);
	}
}