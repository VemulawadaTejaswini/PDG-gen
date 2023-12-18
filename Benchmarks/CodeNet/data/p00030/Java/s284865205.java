import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ans = new int[11][46];
		for(int i=0;i<(1<<10);i++) {
			int count = 0;
			int sum = 0;
			for(int j=0;j<10;j++) {
				if (((1<<j)&i) > 0) {
					sum += j;
					count++;
				}
			}
			ans[count][sum]++;
		}
		while(true) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if (n == 0) {
				break;
			}
			if (s > 45) {
				System.out.println(0);
			}else{
				System.out.println(ans[n][s]);
			}
		}
	}

}