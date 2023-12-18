import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		
		long min = 10000;
		long max = -10000;
		long total = 0;
		long num = 0;
		
		if (0 < n && n <= 10000) {
			for (int i = 0; i < n; i++) {
				if (strs[i].matches("^[0-9]+$")) {
					num = Integer.parseInt(strs[i]);
					if (min > num) min = num;
					if (max < num) max = num;
					total += num;
				}
			}
			
			System.out.println(min + " " + max + " " + total);
		}
	}
		
}