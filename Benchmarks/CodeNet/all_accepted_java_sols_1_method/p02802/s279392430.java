import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = 0, pen = 0;
		int[] x = new int[100001];
		for(int i = 0; i < M; i++) {
			int p = sc.nextInt();
			if(sc.next().equals("WA")) {
				if(x[p] >= 0)
					x[p]++;
			}
			else {
				if(x[p] >= 0) {
					ans++;
					pen += x[p];
					x[p] = -1;
				}
			}
		}
		System.out.println(ans + " " + pen);

	}

}