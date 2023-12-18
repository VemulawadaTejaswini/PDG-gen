import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = (double)Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		System.out.println((int)Math.ceil(N/(2*D+1)));
	}
}