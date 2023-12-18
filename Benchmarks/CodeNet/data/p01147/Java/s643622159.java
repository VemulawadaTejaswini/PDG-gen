import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.xml.crypto.Data;
public class Main{
	static ArrayList<String> list = new ArrayList<String>();
	static int maxLength = 2 << 28;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			maxLength = 2 << 28;
			int n = sc.nextInt();
			if(n == 0) break;
			String[] list = new String[n];
			for(int i = 0; i < n; i++) {
				list[i] = sc.next();
			}
			dfs(0,list,new boolean[n],"");
			Collections.sort(Main.list);
			System.out.println(Main.list.get(0));
			Main.list.clear();
		}
		
	}
	static void dfs(int now, String[] listS, boolean[] use, String a) {
		if(now == listS.length) { 
			if(maxLength > a.length()) {
				maxLength = a.length();
				list.clear();
				list.add(a);
				return;
			}
			if(maxLength == a.length()) {
				list.add(a);
				return;
			}
			return;
		}
		if(a.length() >= maxLength) return;
		for(int i = 0; i < listS.length; i++) {
			if(use[i]) continue;
			for(int j = 0; j < a.length(); j++) {
				boolean ok = true;
				for(int k = 0; k < listS[i].length(); k++) {
					if(j + k == a.length()) {
						use[i] = true;
						dfs(now+1,listS,use,a + listS[i].substring(k));
						use[i] = false;
						ok = false;
						break;
					}
					if(a.charAt(j + k) != listS[i].charAt(k)) {
						ok = false;
						break;
					}
				}
				if(ok) {
					use[i] = true;
					dfs(now+1,listS,use,a);
					use[i] = false;
				}
			}
			use[i] = true;
			dfs(now+1,listS,use,a + listS[i]);
			use[i] = false;
		}
		
	}
}