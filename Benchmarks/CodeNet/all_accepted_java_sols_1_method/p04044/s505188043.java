import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int L = stdIn.nextInt();
		String[] S = new String[N];
		for(int i = 0; i < N; i++) {
			S[i] = stdIn.next();
		}
		
		Arrays.sort(S);
		for(int i = 0; i < N; i++) {
			System.out.print(S[i]);
		}
		System.out.println();

	}

}