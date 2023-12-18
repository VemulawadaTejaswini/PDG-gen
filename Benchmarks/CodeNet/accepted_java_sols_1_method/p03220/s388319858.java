import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		double T=sc.nextDouble(),A=sc.nextInt(),temp=60001;
		int ans = 0;
		for(int i=1; i<=N;i++) {
			double h = A-(T-(0.006*sc.nextDouble()));
			if(Math.abs(h) < Math.abs(temp)) {
				temp = Math.abs(h);
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
