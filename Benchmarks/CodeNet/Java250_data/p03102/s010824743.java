import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int i, j;
		int[] b = new int[m];
		for(i = 0;i < m; i++) {
			b[i] = sc.nextInt();
		}
		int total;
		int cnt = 0;
		for(i = 0;i < n; i++) {
			total = 0;
			for(j = 0;j < m; j++) {
				total += b[j]*sc.nextInt();
			}
			total += c;
			if(total > 0) cnt++;
		}
		System.out.println(cnt);
	}
}
