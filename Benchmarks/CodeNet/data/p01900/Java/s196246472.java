import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			int[] a = new int[3];
			for (int i = 0; i < n; i++) {
				int p = Integer.parseInt(sc.next());
				a[p%3]++;
			}
			
			int cnt = 0;
			if(a[1]!=0 || a[2]!=0) {
				cnt += a[0];
				if(a[1] > a[2]) {
					cnt += a[2]*2;
					cnt += Math.min(3, a[1]-a[2]);
				}else{
					cnt += a[1]*2;
					cnt += Math.min(3, a[2]-a[1]);
				}
			}else{
				cnt = 1;
			}
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}