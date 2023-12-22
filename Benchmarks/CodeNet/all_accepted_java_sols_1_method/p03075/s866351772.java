import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		c = Integer.parseInt(sc.next());
		d = Integer.parseInt(sc.next());
		e = Integer.parseInt(sc.next());
		k = Integer.parseInt(sc.next());

		if (e - a <= k)
			System.out.println("Yay!");
		else
			System.out.println(":(");
	}
}