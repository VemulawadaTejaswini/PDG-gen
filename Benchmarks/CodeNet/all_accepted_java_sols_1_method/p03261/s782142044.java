import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] W = new String[N];

		for(int i=0; i<N; i++) {
			W[i] = sc.next();
		}

		int judge1 = 0;

		for(int j=0; j<N-1; j++) {
			char c1 = W[j].charAt(W[j].length()-1);
			char c2 = W[j+1].charAt(0);

			if(c1 == c2) {
				judge1 += 1;
			}
		}

		int judge2 = 0;

		for(int k=0; k<N-1; k++) {
			for(int l=1; l<N-k; l++) {
				if(W[k].equals(W[k+l])) {
					judge2 += 1;
				}
			}
		}

		if(judge1 == N-1 && judge2 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}