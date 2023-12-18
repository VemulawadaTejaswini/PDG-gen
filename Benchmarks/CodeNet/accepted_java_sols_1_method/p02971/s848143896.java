import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		int max=0,maxInd=0,nextMax = 0;

		for(int i = 1; i <= n; i++) {
			int tmp = in.nextInt();
			if(tmp > max) {
				nextMax = max;
				max = tmp;
				maxInd = i;
			}else if(tmp > nextMax) {
				nextMax = tmp;
			}
		}

		for(int i = 1; i <= n; i++) {
			int ans = (i != maxInd) ? max : nextMax;
			System.out.println(ans);
		}

	}
}
