import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			boolean flag = false;
			int ans = 0;
			for(int i=0;i<n;i++) {
				int k = sc.nextInt();
				ans += Math.min(k, 1);
				if (k >= 2) {
					flag = true;
				}
			}
			if (!flag) {
				System.out.println("NA");
			}else{
				System.out.println(ans+1);
			}
		}
	}

}