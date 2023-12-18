import java.util.*;

public class Main {
	public static void main(String[] args) {
		int r = 0;
		Scanner in = new Scanner(System.in);
		try {
			r = in.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		in.close();
		System.out.println(Math.pow(r, 2) * Math.PI + " " + 2 * r * Math.PI);
	}
}