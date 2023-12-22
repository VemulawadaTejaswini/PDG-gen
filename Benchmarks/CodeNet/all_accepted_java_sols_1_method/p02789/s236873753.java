import java.io.*;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N;
		N = sc.nextLong();
		long M;
		M = sc.nextLong();
		if (N <= M) System.out.println(YES);
		else System.out.println(NO);


	}
}
