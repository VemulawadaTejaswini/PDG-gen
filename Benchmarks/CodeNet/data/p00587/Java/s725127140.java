import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	String s;
	int i1, i2;
	void intersection(String s1, String s2) {
		if (i1 == s1.length()) return;
		if (s1.charAt(i1) == s2.charAt(i2)) {
			s += s1.charAt(i1);
			i1++; i2++;
			intersection(s1, s2);
		} else {
			if (s1.charAt(i1) == '(') {
				int count = 1;
				i1++;
				while (count > 0) {
					if (s1.charAt(i1) == '(') count++;
					else if (s1.charAt(i1) == ')') count--;
					i1++;
				}
			}
			if (s2.charAt(i2) == '(') {
				int count = 1;
				i2++;
				while (count > 0) {
					if (s2.charAt(i2) == '(') count++;
					else if (s2.charAt(i2) == ')') count--;
					i2++;
				}
			}
			intersection(s1, s2);
		}
	}
	
	void union(String s1, String s2) {
		if (i1 == s1.length()) return;
		if (s1.charAt(i1) == s2.charAt(i2)) {
			s += s1.charAt(i1);
			i1++; i2++;
			union(s1, s2);
		} else {
			if (s1.charAt(i1) == '(') {
				int count = 1;
				s += '(';
				i1++;
				while (count > 0) {
					s += s1.charAt(i1);
					if (s1.charAt(i1) == '(') count++;
					else if (s1.charAt(i1) == ')') count--;
					i1++;
				}
			}
			if (s2.charAt(i2) == '(') {
				int count = 1;
				s += '(';
				i2++;
				while (count > 0) {
					s += s2.charAt(i2);
					if (s2.charAt(i2) == '(') count++;
					else if (s2.charAt(i2) == ')') count--;
					i2++;
				}
			}
			union(s1, s2);
		}
	}
	
	void run() {
		while (sc.hasNext()) {
			char c = sc.next().charAt(0);
			String s1 = sc.next(), s2 = sc.next();
			s = "";
			i1 = i2 = 0;
			if (c == 'i') {
				intersection(s1, s2);
			} else {
				union(s1, s2);
			}
			out.println(s);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}