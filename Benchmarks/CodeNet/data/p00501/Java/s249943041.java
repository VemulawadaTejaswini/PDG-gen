import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	String name;
	int len;
	boolean[] position = new boolean[101];
	
	boolean check(String s,int index, int pos) {
		if (index == len) {
			int c = -1, d = -1;
			for (int i = 0; i < s.length(); i++) {
				if (position[i]) {
					if (c < 0)
						c = i;
					else {
						if (d < 0) {
							d = i - c;
							c = i;
						} else {
							if (d != i - c) return false;
							else c = i;
						}
					}
				}
			}
			return true;
		} else {
			boolean flag = false;
			while (pos < s.length()) {
				if (s.charAt(pos) == name.charAt(index)) {
					position[pos] = true;
					flag = flag || check(s, index+1, pos+1);
					position[pos] = false;
				}
				pos++;
			}
			return flag;
		}
	}
	
	void run() {
		int n = sc.nextInt();
		name = sc.next();
		len = name.length();
		int res = 0;
		for (int i = 0; i < n; i++)
			if (check(sc.next(), 0, 0))
				res++;
		out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}