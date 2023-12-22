import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), c = sc.nextInt();
		int b[] = new int[m];
		int ans = 0, a = 0;
		for(int i = 0; i < m; ++i)b[i] = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			a = 0;
			for(int j = 0; j < m; ++j) {
				int tmp = sc.nextInt();
				a += tmp * b[j];
			}
			if(a + c > 0)++ans;
		}
		sc.close();
		System.out.println(ans);
		
	}

}
