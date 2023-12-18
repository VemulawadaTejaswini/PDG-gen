import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int[] votes = new int[N];
		double sum = 0;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			votes[i]=input.nextInt();
			sum+=votes[i];
		}
		double LOWER = sum/M/4;
		for (int i = 0; i < N; i++) {
			if (votes[i]>=LOWER) cnt++;
		}
		if (cnt>=M) System.out.println("Yes");
		else System.out.println("No");
		//System.out.println(sum);
	}
}