import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] As = new int[N];
		double totalVotes = 0;
		for(int i = 0; i < N; i ++) {
			As[i] = stdIn.nextInt();
			totalVotes += As[i];
		}
		
		int buyNum = 0;
		
		for(int i = 0; i < As.length; i ++) {
			if(totalVotes / (4 * M) <= As[i]) {
				buyNum ++;
			}
		}
		
		if(M <= buyNum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}