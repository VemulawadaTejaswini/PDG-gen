import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		sc.close();
		String a = "Yes";
		for(int i=0; i<N; i++) {
			if(S.charAt(i) != S.charAt(N-i-1))
				a = "No";
		}
		for(int i=0; i<(N-1)/2; i++) {
			if(S.charAt(i) != S.charAt((N-1)/2-i-1))
				a = "No";
		}
		for(int i=(N+3)/2; i<N; i++) {
			if(S.charAt(i) != S.charAt(N-i-1))
				a = "No";
		}

		System.out.println(a);
	}

}