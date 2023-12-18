import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// Scanner sc = new Scanner(new System.in);
		// Scanner sc = new Scanner(new File("in1.txt"));
		// Scanner sc = new Scanner(new File("in2.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		int N = Integer.parseInt(br.readLine());
		// sc.nextInt();
		
		// int r0 = sc.nextInt();
		// int r1 = sc.nextInt();
		int r0 = Integer.parseInt(br.readLine());
		int r1 = Integer.parseInt(br.readLine());
		int max_profit = r1 - r0;
		int min_r = Math.min(r0, r1);
		// while (sc.hasNextInt()) {
		for (int i = 2; i < N; i++) {
			// int r = sc.nextInt();
			int r = Integer.parseInt(br.readLine());
			max_profit = Math.max(max_profit, r - min_r);
			min_r = Math.min(min_r, r);
		}
		System.out.println(max_profit);
	}
}