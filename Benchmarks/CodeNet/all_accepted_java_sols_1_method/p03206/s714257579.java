import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int D = in.nextInt();
		if (D == 25) {
			System.out.println("Christmas");
		} else if (D == 24) {
			System.out.println("Christmas Eve ");
		} else if (D == 23) {
			System.out.println("Christmas Eve Eve");
		} else if (D == 22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}
