import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(" ");
			int n = Integer.parseInt(nico[0]);
			int m = Integer.parseInt(nico[1]);
			if ((n == 0) && (m == 0)) break;
			
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = 0;
			}
			
			int cnt = 0;
			int tmp = 0;
			while (cnt < n) {
				for (int i = 0; i < n; i++) {
					if (num[i] != 0) continue;
					tmp++;
					
					if (tmp == m) {
						cnt++;
						num[i] = cnt;
						
						if (cnt == n) System.out.println(i + 1);
						
						tmp = 0;
					}
				}
			}
		}
	}
}