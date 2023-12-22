import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long H;
		H = sc.nextLong();
		long A;
		A = sc.nextLong();
		System.out.println(H / A + ((H % A > 0) ? 1 : 0));
	}
}
