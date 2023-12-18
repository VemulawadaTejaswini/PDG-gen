import java.util.*;

public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner in = new Scanner(System.in);
		try {
			a = in.nextInt();
			b = in.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		in.close();
		if (b == 0) {
			System.err.println("Div. by 0");
			System.exit(1);
		}
		float div = (float)a / b;
		System.out.println((int)div + " " + a % b + " " + div);
	}
}