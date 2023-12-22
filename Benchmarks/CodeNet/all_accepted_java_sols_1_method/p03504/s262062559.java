import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[][] tv = new int[C][200000];
		for(int i = 0; i < N; i++) {
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			for(int j = s*2; j <= t*2; j++)
				tv[c][j] = 1;
		}
		for(int i = 0; i < C; i++)
			for(int j = 1; j < 200000; j++)
				if(tv[i][j] == 1 && tv[i][j-1] == 0)
					tv[i][j-1] = 1;
		int ans = 0;
		for(int j = 0; j < 200000; j++) {
			int temp = 0;
			for(int i = 0; i < C; i++)
				temp += tv[i][j];
			ans = Math.max(temp, ans);
		}
		System.out.println(ans);
	}

}