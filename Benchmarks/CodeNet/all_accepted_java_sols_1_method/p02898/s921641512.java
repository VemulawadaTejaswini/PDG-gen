/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/

	coding: utf-8
	lang: Java8 (OpenJDK 1.8.0)
*/

import java.util.*;
import java.util.Collections; // sorting use
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int n,k;
		int cnt = 0;
		ArrayList<Integer> h;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		h = new ArrayList<Integer>();

		for (int i = 0; i < n; ++i){
			h.add(sc.nextInt());
			if(h.get(i) >= k)	++cnt;
		}
		out.println(cnt);
	}
}
