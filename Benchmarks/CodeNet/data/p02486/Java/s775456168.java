public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(true) {
			String str1 = in.next();
			String str2 = in.next();
			int n = java.lang.Integer.parseInt(str1);
			int x = java.lang.Integer.parseInt(str2);
			int cnt = 0;
			if(n == 0 && x == 0) break;
			for(int i = 1; i <= n; i++) {
				for(int j = i; j <= n; j++) {
					for(int k = j; j <= n; j++) {
						if(i+j+k == x)
							cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}