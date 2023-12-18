import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int[] ab = new int[2001];
		
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				ab[i + j]++;
			}
		}
		
		while (sc.hasNextLine() == true) {
			int sum = Integer.parseInt(sc.nextLine());
			
			int ans = 0;
			
			for (int i = 0; i < (sum + 1); i++) {
				ans = ans + ab[i] * ab[sum - i];
			}
			
			System.out.println(ans);
		}
	}
}