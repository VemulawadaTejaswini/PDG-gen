import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int H = Integer.parseInt(sc.next());
			int W = Integer.parseInt(sc.next());
			int h = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next());
			int ret = (H - h) * (W - w);
			System.out.println(ret);
		} // Scanner Close
	}
}