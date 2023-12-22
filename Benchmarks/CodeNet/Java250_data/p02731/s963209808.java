import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s = (double) Integer.parseInt(sc.next());
		System.out.println(String.format("%.12f", Math.pow(s / 3, 3)));

	}
}