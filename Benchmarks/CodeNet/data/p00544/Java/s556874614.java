import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] w = new int[n];
		int[] b = new int[n];
		int[] r = new int[n];
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j < m; j++) {
				char c = str.charAt(j);
				if(c == 'W') {
					w[i]++;
				}else if(c == 'B') {
					b[i]++;
				}else {
					r[i]++;
				}
			}
		}
		
		int ans = 100000000;
		
		for(int i = 1; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				int tmp = 0;
				
				for(int k = 0; k < i; k++) {
					tmp += m - w[k];
				}
				for(int k = i; k < j; k++) {
					tmp += m - b[k];
				}
				for(int k = j; k < n; k++) {
					tmp += m - r[k];
				}
				
				ans = Math.min(ans, tmp);
			}
		}
		
		System.out.println(ans);
	}
}
