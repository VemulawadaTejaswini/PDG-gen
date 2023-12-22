
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble(), w = sc.nextDouble();
		if (h != 1 && w != 1)
			System.out.println((long) Math.ceil(h * w / 2));
		else
			System.out.println(1);
		sc.close();
	}
}
