import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int H = in.nextInt();
		int W = in.nextInt();
		System.out.println((N - H + 1) * (N - W + 1));

	}

}