

import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String[] S = s.split("");
		String tmp =s.substring(k-1, k).toLowerCase() ;
		S[k-1] = tmp;
		for(int i = 0; i < n; i++) {
			System.out.print(S[i]);
		}
		System.out.println();
		sc.close();
	}
}
