import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[] = new int[n+1];
		p[0]=Integer.MAX_VALUE;
		int min[] = new int[n+1];
		min[0]=p[0];
		for(int i=1; i<=n; i++) {
			p[i]=sc.nextInt();
			min[i]=Math.min(min[i-1], p[i]);
		}
		int cnt=0;
		for(int i=1; i<=n; i++) {
			if(min[i-1]>=p[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
