import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int k = sc.nextInt();
				if(n+k == 0) break;
				
				int[][] s = new int[n+1][2];
				boolean[] c = new boolean[n+1];
				for(int i=0; i<k; i++) c[sc.nextInt()] = true;
				
				int max0 = 0;
				int max1 = 0;
				for(int i=1; i<=n; i++) {
					s[i][0] = c[i] ? s[i-1][0]+1 : 0;
					s[i][1] = c[i] ? s[i-1][1]+1 : s[i-1][0]+1;
					max0 = Math.max(max0, s[i][0]);
					max1 = Math.max(max1, s[i][1]);
				}
				System.out.println(c[0] ? max1 : max0);
			}
		}
	}
}
