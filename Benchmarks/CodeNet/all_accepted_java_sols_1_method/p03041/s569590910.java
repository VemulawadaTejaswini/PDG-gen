import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		String S = stdIn.next();
		String[] words = S.split("", 0);
		if(words[K-1].equals("A")) {
			words[K-1] = "a";
		}
		else if(words[K-1].equals("B")) {
			words[K-1] = "b";
		}
		else if(words[K-1].equals("C")) {
			words[K-1] = "c";
		}
		for(int i = 0; i < N; i++) {
			System.out.print(words[i]);
		}

	}

}