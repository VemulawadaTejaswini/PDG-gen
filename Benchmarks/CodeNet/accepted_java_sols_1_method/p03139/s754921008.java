import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int A = Integer.parseInt(tokens[1]);
		int B = Integer.parseInt(tokens[2]);

		int max = Math.min(A, B);
		int min = Math.max(A + B - N, 0);
		System.out.println(max + " " + min);

		in.close();
	}

}
