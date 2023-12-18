import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {
	
	String[] key = {" ", ".,!? ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			String str = sc.next();
			int n = str.length();
			int k = str.charAt(0) - '0', p = 0;
			for(int i=1;i<n;i++) {
				if( str.charAt(i-1) == str.charAt(i) ) p = (p+1)%key[k].length();
				else {
					if( str.charAt(i) - '0' == 0 ) System.out.print(key[k].charAt(p)); 
					k = str.charAt(i) - '0';
					p = 0;
				}
			}
			System.out.println();
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}