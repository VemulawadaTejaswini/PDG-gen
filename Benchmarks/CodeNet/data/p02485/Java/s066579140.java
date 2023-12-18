import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int x = Integer.parseInt(br.readLine());
			if (0 == x) break;
			System.out.println(solve(x));
		}
	}
	
	public static int solve(int x) {
		int sum = 0; 
		while (x != 0) {
			sum += x%10;
			x /= 10;
		}
		return sum;
	}
}