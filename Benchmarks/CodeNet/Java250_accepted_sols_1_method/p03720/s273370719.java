import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int i, cnt = 0;;
		int[] a = new int[M];
		int[] b = new int[M];
		for(i = 0;i < M;i ++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(i = 1;i <= N;i ++) {
			for(int k = 0;k < M;k ++) {
				if(i == a[k]) cnt++;
				if(i == b[k]) cnt++;
			}
			System.out.println(cnt);
			cnt = 0;
		}
	}
}