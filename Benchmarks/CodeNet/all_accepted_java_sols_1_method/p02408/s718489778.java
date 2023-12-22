import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n;
		String[] token;
		int rank;
		boolean[] S = new boolean[13]; 
		boolean[] H = new boolean[13]; 
		boolean[] C = new boolean[13]; 
		boolean[] D = new boolean[13];
		
		for (int i = 0; i < 13; i++) {
			S[i] = H[i] = C[i] = D[i] = false;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			token = br.readLine().split(" ");
			rank = Integer.parseInt(token[1]);
			if (token[0].equals("S")) {
				S[rank - 1] = true;
			} else if (token[0].equals("H")) {
				H[rank - 1] = true;
			} else if (token[0].equals("C")) {
				C[rank - 1] = true;
			} else if (token[0].equals("D")) {
				D[rank - 1] = true;
			}
		}
		
		for (int i = 0; i < 13; i++) {
			if (!S[i]) System.out.println("S " + (i + 1));
		}
		for (int i = 0; i < 13; i++) {
			if (!H[i]) System.out.println("H " + (i + 1));
		}
		for (int i = 0; i < 13; i++) {
			if (!C[i]) System.out.println("C " + (i + 1));
		}
		for (int i = 0; i < 13; i++) {
			if (!D[i]) System.out.println("D " + (i + 1));
		}
	}
}