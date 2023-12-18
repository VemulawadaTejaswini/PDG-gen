import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int s;
	private boolean[] flag;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			String[] nico = sc.nextLine().split(" ");
			int n = Integer.parseInt(nico[0]);
			
			s = Integer.parseInt(nico[1]);
			
			flag = new boolean[10];
			for (int i = 0; i < flag.length; i++) {
				flag[i] = false;
			}
			
			System.out.println(dfs(n, 0));
		}
	}
	
	private int dfs(int n, int sum) {
		if (n == 0) {
			if (sum == s) return 1;
			return 0;
		}
		
		int ans = 0;
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == false) {
				flag[i] = true;
				ans = ans + dfs((n - 1), sum + n * i);
				flag[i] = false;
			}
		}
		
		return ans;
	}
}