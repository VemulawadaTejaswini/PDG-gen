import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N,A,B,C,X;
	static int[] Y;
	public static void main(String[] args) {
		while(read())	solve();
	}
	private static void solve() {
		int frame = 0;
		int ptr = 0;
		while(true){
			if(Y[ptr] == X)	ptr++;
			X = (A*X + B) % C;
			//System.out.println(X);
			//System.out.println("X=" + X + "\tptr=" + ptr);
			
			if(ptr==N) {
				System.out.println(frame);
				break;
			} else if (frame>=10000) {
				System.out.println("-1");
				break;
			}
			frame++;
		}
	}
	private static boolean read() {
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		X = sc.nextInt();
		if (N==0 && A==0 && B==0 && C==0 && X==0) {
			return false;
		}

		Y = new int[N];
		for(int i=0; i<N; i++) {
			Y[i] = sc.nextInt();
		}
		return true;
	}

}