import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner $ = new Scanner(System.in);
		int N = $.nextInt(), K = $.nextInt();
		String S = $.next();
		System.out.print(S.substring(0, K - 1));
		if (S.substring(K - 1, K).equals("A")) System.out.print("a");
		else if (S.substring(K - 1, K).equals("B")) System.out.print("b");
		else System.out.print("c");
		System.out.println(S.substring(K, N));
		/*
		3 1 ABC -> aBC
		4 3 CABA -> CAbA
		*/
	}
}
