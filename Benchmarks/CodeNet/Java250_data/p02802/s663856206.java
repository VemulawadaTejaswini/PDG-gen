import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean ac[] = new boolean[n+1];
		long wa[] = new long[n+1];
		for(int i=0; i<m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if(ac[p]) continue;
			if(s.equals("AC")) {
				ac[p]=true;
			} else {
				wa[p]++;
			}
		}
		long sum1=0;
		long sum2=0;
		for(int i=1; i<=n; i++) {
			if(ac[i]) {
				sum1++;
				sum2 += wa[i];
			}
		}
		System.out.println(sum1 + " " + sum2);
		sc.close();
	}
}
