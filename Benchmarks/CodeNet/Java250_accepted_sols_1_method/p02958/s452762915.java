/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/
*/

import java.util.*;
import java.util.Collections; // sorting use
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int n;
		int cnt = 0;
		ArrayList<Integer> p = new ArrayList<Integer>(53);
		Scanner sc = new Scanner(System.in);

		p.add(0);
		n = sc.nextInt();
		for (int i = 1; i <= n; ++i) {
			p.add(sc.nextInt());
			if(p.get(i) != i)	++cnt;
		}
		if(cnt >= 3)	out.println("NO");
		else out.println("YES");
	}
}
