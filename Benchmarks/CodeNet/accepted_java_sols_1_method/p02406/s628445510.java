import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine().toString());
		int i = 1;
		int x;
		
		do {
			x = i;
			
			if (x % 3 == 0) {
				sb.append(" ").append(i);
				if ((i + 1) <= n) continue;
			} else {
				do {
					if (x % 10 == 3 || String.valueOf(x).matches(".*[3].*")) sb.append(" ").append(i);
					if ((i + 1) <= n) break;
					
					x /= 10;
					
					if (x == 0) {
						continue;
					} else {
						break;
					}
				} while (true);
			}
		} while (++i <= n);
		
		System.out.println(sb);
	}
}