import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] load = new int[M][2];
		for(int i = 0;i < M;++i) {
			load[i][0] = sc.nextInt()-1;
			load[i][1] = sc.nextInt()-1;
		}
		sc.close();
		
		int[] ans = new int[N];
		for(int i = 0;i < M;++i) {
			if(load[i][0] != load[i][1]) {
				ans[load[i][0]]++;
				ans[load[i][1]]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < N;++i) {
			sb.append(ans[i]);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
