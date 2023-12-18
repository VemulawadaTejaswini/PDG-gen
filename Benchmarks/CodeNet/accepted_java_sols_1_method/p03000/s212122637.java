/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/
*/

import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int n,x;
		int cnt = 1;
		Scanner sc = new Scanner(in);
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		n = sc.nextInt();
		x = sc.nextInt();
		d.add(0);
		for (int i = 1; i <= n; ++i){
			l.add(sc.nextInt());
			d.add(d.get(i - 1) + l.get(i - 1));
			if(d.get(i) <= x){
				++cnt;
			}
			// out.println(d.get(i));
		}
		out.println(cnt);
	}
}
