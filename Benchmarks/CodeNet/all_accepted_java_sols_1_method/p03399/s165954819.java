import java.util.*;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = 0;

			for (int i = 0; i < 2; i++)
				t += Math.min(sc.nextInt(), sc.nextInt());

			System.out.println(t);
		}
	}
}