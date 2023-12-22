import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int w = Integer.parseInt(sc.nextLine());
			int n = Integer.parseInt(sc.nextLine());
			int[] ans = new int[w];
			for (int i = 0; i < ans.length; i++) {
				ans[i] = i + 1;
			}
			while (sc.hasNext()) {	
				String[] s = sc.nextLine().split(",");
				int x = Integer.parseInt(s[0]) - 1;
				int y = Integer.parseInt(s[1]) - 1;
				int tmp = ans[x];
				ans[x] = ans[y];
				ans[y] = tmp;
				
			}
			for (int z : ans) {
				System.out.println(z);
			}
		}
	}
}