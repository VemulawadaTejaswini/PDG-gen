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
		int a,b;
		int k;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		k = (a + b) / 2;

		if(Math.abs(k - a) == Math.abs(k - b))	out.println(k);
		else out.println("IMPOSSIBLE");
	}
}
