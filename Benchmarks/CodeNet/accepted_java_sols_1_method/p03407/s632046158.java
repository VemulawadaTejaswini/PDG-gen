import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();
		if (A + B >= C) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}