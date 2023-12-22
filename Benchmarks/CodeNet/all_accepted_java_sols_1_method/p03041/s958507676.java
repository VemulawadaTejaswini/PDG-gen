
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] S = new char[N];
		S = sc.next().toCharArray();

		S[K-1] = S[K-1]=='A' ? 'a' : S[K-1]=='B' ? 'b' : 'c';

		System.out.println(S);

	}


}