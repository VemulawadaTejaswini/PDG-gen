import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int p[] = new int[n];
      	int s[] = new int[n];
      	
		int ok = 0;
		int ng = 0;
		
		for(int i = 0; i < m; i++) {
			int pn = scan.nextInt() -1;
			String sn = scan.next();
			if(p[pn] == 1) {
				continue;
			} else {
				if(sn.equals("AC")) {
					p[pn] = 1;
				} else {
					s[pn]++;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(p[i] == 1) {
				ok++;
				ng = ng + s[i];
			}
		}
		
		System.out.println(ok + " " + ng);
	}
}