import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		String[] S = new String[N];
		for(int i = 0;i < N;i++) {
			S[i] = sc.next();
		}
		sc.close();
		Arrays.sort(S);
		StringBuilder sb = new StringBuilder();
		for(String s : S) {
			sb.append(s);
		}
		System.out.println(sb.toString());
	}
}