import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strargs;
		int n, x, i, j, k, sum;
		
		do {
			sum = 0;			
			strargs = br.readLine().split("\\s+");
			n = Integer.parseInt(strargs[0]);
			x = Integer.parseInt(strargs[1]); 
			
			for (i = 1; i <= n; i++) {
				for (j = i; j <= n; j++) {
					for (k = j; k <= n; k++) {
						if ((i + j + k) == x && i != j && j != k && i != k) sum++;
					}
				}
			}
			
			if (n == 0 && x ==0) break;
			
			System.out.println(sum);

		} while (true);
	}
}