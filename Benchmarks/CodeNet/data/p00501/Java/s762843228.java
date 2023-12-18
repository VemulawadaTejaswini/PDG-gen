import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main{

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String t = sc.next();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j=0;j<s.length();j++) if( t.charAt(0) == s.charAt(j) ) {
				boolean f = false;
				for(int k=1;k<=n;k++) {
					int pt = 0, ps = j;
					while(pt < t.length() && ps < s.length() && t.charAt(pt) == s.charAt(ps)) {
						pt++; ps+=k;
					}
					if(pt == t.length()) {
						f = true;
						break;
					}
				}
				if(f) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}