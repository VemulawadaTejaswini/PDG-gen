/**
 * 
 */

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kumar1
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		InputStream in = System.in;
		Scanner scanner = new Scanner(in);
		LinkedList<Integer> ans = new LinkedList<Integer>();
		while (true) {
			int n = scanner.nextInt();
			int p = scanner.nextInt();
			if (n == 0 || p == 0)
				break;
			int[] temoto = new int[n];
			for (int i = 0;; i++) {
				if(p == 0) {
					int j;
					for(j=0; j < n; j++) {
						if(i != j && temoto[j] != 0)
							break;
					}
					if(j >= n) {
						ans.add(i);
						break;
					}
					p = temoto[i];
					temoto[i] = 0;
				} else {
					temoto[i]++;
					p--;
				}
				
				if(i == n-1)
					i = -1;
			}
		}
		for (int a : ans)
			System.out.println(a);
	}

}