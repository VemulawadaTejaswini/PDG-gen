import java.util.*;
public class Main {
	static int out = 0;
	static boolean nF = false;
	static boolean nS = false;
	static boolean nT = false;
	static int A = 0;
	static boolean END = false;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			int n = stdIn.nextInt();
			for(int i = 0; i < n; i++) {
				out = 0;
				nF = false;
				nS = false;
				nT = false;
				A = 0;
				END = false;
				while(true) {
					if(END) break;
					String tmp = stdIn.next();
					if(tmp.equals("HIT")) hit();
					if(tmp.equals("OUT")) out();
					if(tmp.equals("HOMERUN")) homerun();
				}
				System.out.println(A);
		}
	}
	public static void hit() {
		if(!nF) {
			nF = true;
		}
		else if(!nS) {
			nS = true;
		}
		else if(!nT) {
			nT = true;
		}
		else {
			A++;
		}
	}
	
	public static void out() {
		out++;
		if(out > 2) {
			END = true;
		}
	}
	
	public static void homerun() {
		if(nT) {
			nT = nS = nF = false;
			A += 4;
		}
		else if(nS) {
			nS = nF = false;
			A += 3;
		}
		else if(nF) {
			nF = false;
			A += 2;
		}
		
		else {
			A += 1;
		}
	}
	
}