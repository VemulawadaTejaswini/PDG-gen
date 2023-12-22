import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] W = new String[N];

		String[] chaf = new String[N];

		String[] chal = new String[N];

		for(int i=0;i<N; i++) {
			W[i] = sc.next();
		}



		for(int i=0;i<N; i++) {
		chal[i] = String.valueOf(W[i].charAt(W[i].length()-1));
		chaf[i] = String.valueOf(W[i].charAt(0));
	}

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i!=j) {
					if(W[i].equals(W[j])) {System.out.print("No");
						System.exit(0);
					}

				}
			}
		}

		for(int i=0; i<N-1; i++) {
			if(chal[i].equals(chaf[i+1])) {		}
			else {System.out.print("No");
			System.exit(0);
			}
		}

		System.out.print("Yes");

}
}
