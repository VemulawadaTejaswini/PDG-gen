import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n_cards = Integer.parseInt(br.readLine());
		
		boolean[] S = new boolean[14];
		boolean[] H = new boolean[14];
		boolean[] C = new boolean[14];
		boolean[] D = new boolean[14];
		
		for (int i = 0; i < n_cards; i++) {
			String sz_input = br.readLine();
			String[] sz_type = sz_input.split(" ");
			int n_number = Integer.parseInt(sz_type[1]);
			
			switch (sz_type[0]) {
			case "S":
				S[n_number] = true;
				break;
			case "H":
				H[n_number] = true;
				break;
			case "C":
				C[n_number] = true;
				break;
			case "D":
				D[n_number] = true;
				break;
			}
		}
		

		for (int i = 1; i < 14; i++) {
			if (S[i] == false) {
				System.out.println("S " + i);
			}
		}
		for (int i = 1; i < 14; i++) {
			if (H[i] == false) {
				System.out.println("H " + i);
			}
		}
		for (int i = 1; i < 14; i++) {
			if (C[i] == false) {
				System.out.println("C " + i);
			}
		}
		for (int i = 1; i < 14; i++) {
			if (D[i] == false) {
				System.out.println("D " + i);
			}
		}
	}
}