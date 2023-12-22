import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		if(L == 0);
		String[]S = new String[N];
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
		}
		sc.close();
		Arrays.sort(S);
		StringBuilder sb = new StringBuilder();
		for(String t : S) {
			sb.append(t);
		}
		System.out.println(sb.toString());
	}
}
