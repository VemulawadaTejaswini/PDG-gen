import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	void run() {
		int n = scan.nextInt();
		int[] S = new int[13];
		int[] H = new int[13];
		int[] C = new int[13];
		int[] D = new int[13];

		for(int i = 0; i < n; i++) {
			String t = scan.next();
			if("S".equals(t)) {
				int j = scan.nextInt();
				S[j-1]++;
			} else if("H".equals(t)) {
				int j = scan.nextInt();
				H[j-1]++;
			} else if("C".equals(t)) {
				int j = scan.nextInt();
				C[j-1]++;
			} else if("D".equals(t)) {
				int j = scan.nextInt();
				D[j-1]++;
			}
		}

		for (int i = 0; i < 13; i++) {
			if(S[i] == 0) {
				System.out.println("S " + (i+1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if(H[i] == 0) {
				System.out.println("H " + (i+1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if(C[i] == 0) {
				System.out.println("C " + (i+1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if(D[i] == 0) {
				System.out.println("D " + (i+1));
			}
		}
	}

	public static void main(String[] args){
		//TODO Auto-generated mathod stub
		new Main().run();
	}
}