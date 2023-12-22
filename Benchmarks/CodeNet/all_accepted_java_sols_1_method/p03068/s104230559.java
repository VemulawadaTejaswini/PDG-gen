import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner $ = new Scanner(System.in);
		int N = $.nextInt(), K = 0;
		String S = $.next(), s = "";
		K = $.nextInt();
		s = S.substring(K - 1, K);
		for (int i = 0; i < N; i++){
			String Judge = S.substring(i, i + 1);
			if (Judge.equals(s))  System.out.print(Judge);
			else System.out.print("*");
		}
		System.out.println();
		/*
		5 error 2 -> *rr*r
		6 eleven 5 -> e*e*e*
		9 education 7 -> ******i**
		*/
	}
}
