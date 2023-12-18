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

	
	int solve(int n){
		int r = 0;
		for(int j = 2,i = 1,s = 3;j<n;s += (s < n)?++j:-i++)
			if(s == n) r++;
		return r;
	}
}