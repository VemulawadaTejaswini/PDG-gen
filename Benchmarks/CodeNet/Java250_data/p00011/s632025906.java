import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] c = new int[k][];
		
		for(int i = 0; i < k; i++) {
			String s = sc.next();
			String[] ns = s.split(",");
			c[i] = new int[]{Integer.parseInt(ns[0]) - 1, Integer.parseInt(ns[1]) - 1};
		}
		int[] res = new int[n];
		for(int i = 0; i < n; i++) {
			int ret = i;
			for(int j = 0; j < k; j++) {
				for(int l = 0; l < 2; l++) {
					if(c[j][l] == ret) {
						ret = c[j][(l + 1) % 2];
						break;
					}
				}
			}
			res[ret] = i;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(res[i] + 1);
		}
	}
}