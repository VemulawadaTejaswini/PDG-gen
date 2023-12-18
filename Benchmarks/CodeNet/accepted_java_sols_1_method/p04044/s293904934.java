

import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, l;
		String s[];
		
		n = sc.nextInt();
		l = sc.nextInt();	
		
		s = new String[n];
		
		for(int i = 0; i < n; ++i) {
			s[i] = sc.next();
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = i + 1; j < n; ++j) {
				if(s[i].compareToIgnoreCase(s[j])>0) {
					String tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < n; ++i) {
			System.out.print(s[i]);
		}
		System.out.println();
		
		sc.close();
		
	}

}
