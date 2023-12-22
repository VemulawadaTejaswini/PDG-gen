import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][] = new int[M][2];
		//int b[] = new int[M];
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, Comparator.comparingInt(o -> o[1]));
		
		int temp_a = a[0][0];
		int temp_b = a[0][1];
		int ans_cnt = 1;
		for(int i = 0; i < M; i++) {
			if(temp_a != a[i][0] && temp_b <= a[i][0]) {
				temp_a = a[i][0];
				temp_b = a[i][1];
				ans_cnt++;
			} else {
				temp_b = Math.min(temp_b, a[i][1]);
			}
		}
		
		System.out.println(ans_cnt);
	}
}
