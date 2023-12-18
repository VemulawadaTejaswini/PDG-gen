import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] eq;
	int len;
	
	int index;
	int token;
	int value;
	int ch;
	
	final int NUM = -256;
	final int LF = '\n';
	
	int[] pqr = new int[3];
	
	int not(int x) {
		if (x == 0)
			return 2;
		else if (x == 1)
			return 1;
		else if (x == 2)
			return 0;
		
		return -1;
	}
	
	int and(int x, int y) {
		if (x == 0 || y == 0)
			return 0;
		else if (x == 1 || y == 1)
			return 1;
		else if (x == 2 || y == 2)
			return 2;
		
		return -1;
	}
	
	int or(int x, int y) {
		if (x == 2 || y == 2)
			return 2;
		else if (x == 1 || y == 1)
			return 1;
		else if (x == 0 || y == 0)
			return 0;
		
		return -1;
	}
	
	
	void gettoken() {
		if (ch == '-' || ch == '(' || ch == ')' || ch == '*' || ch == '+') {
			token = ch;
			ch = eq[index++];
		} else if (ch == LF){
			token = ch;
		} else {
			token = NUM;
			
			switch (ch) {
			case '0': value = 0; break;
			case '1': value = 1; break;
			case '2': value = 2; break;
			case 'P': value = pqr[0]; break;
			case 'Q': value = pqr[1]; break;
			case 'R': value = pqr[2]; break;
			}
			
			ch = eq[index++];
		}
	}
	
	int F() {
		int v = 0;
		if (token == NUM) {
			v = value;
			gettoken();
		} else if (token == '-') {
			gettoken();
			v = not(F());
		} else if (token == '(') {
			int vnext, savetoken;
			gettoken(); 
			v = F();
			savetoken = token;
			gettoken();
			vnext = F();
			if (savetoken == '*') {
				v = and(v, vnext);
			} else if (savetoken == '+') {
				v = or(v, vnext);
			}
			if (token == ')') gettoken();
		}
		
		return v;
	}
	
	void run() {
		String s;
		while (true) {
			s = sc.nextLine();
			if (s.equals(".")) break;
			len = s.length();
			eq = new int[len+1];
			for (int i = 0; i < len; i++)
				eq[i] = s.charAt(i);
			eq[len] = LF;
			
			int ans = 0;
			for (int p = 0; p <= 2; p++) {
				for (int q = 0; q <= 2; q++) {
					for (int r = 0; r <= 2; r++) {
						pqr[0] = p;
						pqr[1] = q;
						pqr[2] = r;
						
						index = 0;
						ch = eq[index++];
						gettoken();
						if (F() == 2) ans++;
					}
				}
			}
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}