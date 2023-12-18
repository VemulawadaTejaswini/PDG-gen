import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		while (n - 500 >= 0)
			n -= 500;
		if (n <= a)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
