import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		double T = (double) Integer.parseInt(tokens[0]);
		double X = (double) Integer.parseInt(tokens[1]);
		System.out.println((T / X));
	}
}
