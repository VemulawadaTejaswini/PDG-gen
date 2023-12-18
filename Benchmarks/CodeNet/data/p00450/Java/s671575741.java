import java.util.*;

public class Main {
	private int[] table;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int n = scan.nextInt();
			if (n == 0) break;
			
			table = new int[n];
			//Arrays.fill(table, -1);
			for (int i = 0; i < n; i++) {
				int p = scan.nextInt();
				if ((i+1) % 2 == 0) {
					if (table[0] != p) {
						int q = table[i - 1];
						int j = i - 1;
						while (j >= 0 && q == table[j]) {
							table[j] = p;
							j--;
						}
					}
				}
				table[i] = p;
				//System.out.println(p+":"+Arrays.toString(table));
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (table[i] == 0) count++;
			}
			//System.out.println(Arrays.toString(table));
			System.out.println(count);
		}
	}
}