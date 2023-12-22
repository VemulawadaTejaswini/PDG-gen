import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		sC();
	}

	void sC() {
		String s = sc.next();
		int zero = 0, one = 0;
		char c[] = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '0') zero++;
			else one++;
		}
		if(one > zero) {
			System.out.println(zero * 2);
		}
		else System.out.println(one * 2);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
