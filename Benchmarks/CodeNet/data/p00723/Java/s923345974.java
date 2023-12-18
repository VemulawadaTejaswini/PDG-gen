import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			HashSet<String> set = new HashSet<String>();
			StringBuffer s = new StringBuffer(sc.next());
			set.add(s.toString());
			for(int j=1;j<s.length();j++) {
				StringBuffer s1 = new StringBuffer(s.substring(0, j)), s2 = new StringBuffer(s.substring(j));
				
				set.add(s1.append(s2.reverse()).toString()); s1.delete(j, s.length());
				set.add(s1.reverse().append(s2).toString()); s1.delete(j, s.length());
				set.add(s1.append(s2.reverse()).toString()); s1.delete(j, s.length());
				set.add(s2.append(s1).toString()); s2.delete(s.length()-j, s.length());
				set.add(s2.append(s1.reverse()).toString()); s2.delete(s.length()-j, s.length());
				set.add(s2.reverse().append(s1).toString()); s2.delete(s.length()-j, s.length());
				set.add(s2.append(s1.reverse()).toString());
				debug(set);
			}
			debug(i, set);
			System.out.println(set.size());
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}