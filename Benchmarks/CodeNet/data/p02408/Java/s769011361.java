import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]S = new int[13];
		int[]H = new int[13];
		int[]C = new int[13];
		int[]D = new int[13];
		for(int i = 0; i < n; i++) {
			String s = scan.next();
			int k = scan.nextInt();
			if(s.equals("S")) {
				S[k - 1] = 1;
			}else if(s.equals("H")) {
				H[k - 1] = 1;
			}else if(s.equals("C")) {
				C[k - 1] = 1;
			}else {
				D[k - 1] = 1;
			}
		}
		scan.close();
		for(int i = 0; i < 13; i++) {
			if(S[i] == 0) {
				int m = i + 1;
				System.out.println("S " + m);
			}
		}
		for(int i = 0; i < 13; i++) {
			if(H[i] == 0) {
				int m = i + 1;
				System.out.println("H " + m);
			}
		}
		for(int i = 0; i < 13; i++) {
			if(C[i] == 0) {
				int m = i + 1;
				System.out.println("C " + m);
			}
		}
		for(int i = 0; i < 13; i++) {
			if(D[i] == 0) {
				int m = i + 1;
				System.out.println("D " + m);
			}
		}
	}
}
