import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			// CHECK_NUM  3??§???????????????
			if (i%3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			
			// INCLIDE 3  ??°??????3?????????
			for (int tmp = i; tmp > 0; tmp/=10) {
				if (tmp % 10 == 3) {
					System.out.print(" " + i);
					break;
				}
			}
		}
		
		System.out.println();
	}
}