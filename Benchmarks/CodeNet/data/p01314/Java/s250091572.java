import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	public void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(solve(n));
		}
	}

	private int solve(int n) {
		
		int right = 2;
		int left = 0;
		int sum = 3;
		
		int result = 0;
		for(;right<n;){
			if(sum == n){
				result++;
				right++;
				sum += right;
			}else if(sum < n){
				right++;
				sum += right;
			}else{
				left++;
				sum -= left;
			}
		}
		return result;
	}
}