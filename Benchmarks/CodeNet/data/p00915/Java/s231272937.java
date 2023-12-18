import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt(), l = cin.nextInt();
			if (n == 0) break;
			int dir[] = new int[n];
			int pos[] = new int[n];
			boolean in[] = new boolean[n];
			//System.out.println("ffff");
			for (int i = 0; i < n; ++ i) {
				in[i] = true;
				String s = cin.next();
				if (s.charAt(0) == 'L') dir[i] = -1;
				else dir[i] = 1;
				pos[i] = cin.nextInt();
			}
			int ltime = -1, rtime = -1, lid = -1, rid = -1;
			for (int t = 1, rest = n; rest > 0; ++ t) {
				for (int i = 0; i < n; ++ i) {
					pos[i] += dir[i];
				}
				for (int i = 0; i < n; ++ i) {
					if (!in[i]) continue;
					if (pos[i] == 0) {
						in[i] = false; -- rest;
						ltime = t; lid = i + 1;
					}
					if (pos[i] == l) {
						in[i] = false; -- rest;
						rtime = t; rid = i + 1;
					}
				}
				for (int i = 0; i < n; ++ i) {
					for (int j = 0; j < n; ++ j) {
						if (i != j && in[i] && in[j] && pos[i] == pos[j]) {
							dir[i] = -dir[i];
						}
					}
				}
			}
			if (ltime >= rtime) System.out.println(ltime + " " + lid);
			else System.out.println(rtime + " " + rid);
		}
	}
}