import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] dis = new int[102];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for(int i = 0;i < 102; i++) {
			dis[i] = i;
			for(int j = 0; j <n ;j++) {
				if(p[j]==dis[i]) {
					dis[i] = -100;
					break;
				}
			}
		}
		int min = Integer.MAX_VALUE;
		int ans = -1;
		for(int i = 0; i < 102; i++) {
			int temp = Math.abs(x-dis[i]);
			if(temp < min) {
				min = temp;
				ans = i;
			}
		}
		System.out.println(ans);
	}
}