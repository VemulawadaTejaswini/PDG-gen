import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x == w / 2 && y == h / 2) {
			System.out.println(w * h / 2 + " " + 1);
		} else {
			System.out.println(w * h / 2 + " " + 0);
		}
	}
}

