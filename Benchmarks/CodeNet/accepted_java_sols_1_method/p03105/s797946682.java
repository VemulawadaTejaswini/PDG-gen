import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		if (A * C <= B) {
			System.out.println(C);
		} else {
			System.out.println(Math.floorDiv(B, A));
		}
		in.close();
	}

}