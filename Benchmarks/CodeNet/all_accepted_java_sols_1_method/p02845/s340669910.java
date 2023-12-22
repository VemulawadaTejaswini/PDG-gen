import java.util.Scanner;

public class Main {
	static final long mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] color = new int[3];

		if(a[0] == 0) {
			ans = 3;
			color[0] = 1;
			int x = 0;
			boolean flag = true;
			for (int i = 1; i < n; i++) {
				x = 0;
				flag = true;
				for(int j = 0; j < 3; j++) {
					if(color[j] == a[i]) {
						x++;
						if(flag) {
							color[j]++;
							flag = false;
						}
					}
				}
				ans = (x*ans)%mod;
			}

		}else {
			ans = 0;
		}

		System.out.println(ans);
		sc.close();
	}
}