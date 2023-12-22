import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int h1 = scn.nextInt();
		int m1 = scn.nextInt();
		int h2 = scn.nextInt();
		int m2 = scn.nextInt();
		int k = scn.nextInt();
		int tt = (h2 * 60 + m2) - (h1 * 60 + m1);
		System.out.println(tt - k);
		return;
	}

}
