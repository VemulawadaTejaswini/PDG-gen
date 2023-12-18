import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int X = Integer.parseInt(tokens[2]);

		if (X >= A && X <= A + B) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}
