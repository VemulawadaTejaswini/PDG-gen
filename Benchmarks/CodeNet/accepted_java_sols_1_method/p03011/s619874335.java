import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int P = scn.nextInt(), Q = scn.nextInt(),R = scn.nextInt();
		System.out.println(P+Q+R-Math.max(P, Math.max(Q,R)));
	}

}
