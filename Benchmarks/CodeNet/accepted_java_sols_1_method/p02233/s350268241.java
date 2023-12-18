import java.util.Scanner;


public class Main {
	
	private static int[] cache;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();

		// ボトムアップ型
		cache = new int[n + 1];
		cache[0] = 1;
		cache[1] = 1;
		for (int i = 2; i <= n; i++) {
			cache[i] = cache[i - 1] + cache[i - 2];
		}
		int ret = cache[n];
		
		System.out.println(ret);
		
         sc.close();
	}
}