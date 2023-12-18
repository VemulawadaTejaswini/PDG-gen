import java.util.Scanner;
public class Main {
	static Scanner stdIn = new Scanner(System.in);
	
	public static int parimitual(int n, int m, double p) {
		int sum = 0, winner = 0;
		int[] vote = new int[n];
		for(int r = 0; r < n; r++) {
			vote[r] = stdIn.nextInt();
			sum += vote[r];
			if(m == r + 1) winner = vote[r];
		}
		int money = 100 * sum;
		money -= money * p;
		if(winner == 0) return(0);
		return(money / winner);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -1, m = -1;
		double p = -1;
		
		while(true) {
			n = stdIn.nextInt();
			m = stdIn.nextInt();
			p = stdIn.nextInt();
			if(n + m + p == 0) break;
			p /= 100;
			System.out.println(parimitual(n, m, p));
		}
	}
}