
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l = sc.nextLong();
		l = Math.pow(l, 3);
		l /= 27;
		System.out.println(l);
	}

}
