import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] W = new String[N];
		for(int i = 0; i < N; i++) {
			W[i] = scan.next();
		}

		if (kaburi(W)) {
			System.out.println("No");
			return;
		}

		for (int i= 0; i < W.length-1; i++) {
			if(!W[i].substring(W[i].length()-1).equals(W[i+1].substring(0,1))) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}

	public static boolean kaburi(String[] W) {
		for (int i = 0; i < W.length-1; i++) {
			for (int j = i+1; j < W.length; j++) {
				if (W[i].equals(W[j])) {
					return true;
				}
			}
		}
		return false;
	}
}
