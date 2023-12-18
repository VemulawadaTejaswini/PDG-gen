import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = Integer.parseInt(sc.next());
		char[] c = new char[n];
		String cs = sc.next();
		for(int i = 0; i < n; i++) {
			c[i] = cs.charAt(i);
		}
		
		int rcnt = 0;
		int wcnt = 0;
		for(int i = 0; i < n; i++) {
			if(c[i] == 'R') {
				rcnt++;
			}
		}
		for(int i = 0; i < rcnt; i++) {
			//System.out.println(c[i]);
			if(c[i] == 'W') {
				wcnt++;
			}
		}
		//System.out.println(rcnt);
		System.out.println(wcnt);
		

	}
}

