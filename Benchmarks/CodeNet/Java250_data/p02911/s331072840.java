
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = sc.nextInt();
		int q = sc.nextInt();
		
		int[] point = new int[n];
		for (int i = 0; i < point.length; i++) {
			point[i] = sp - q;
		}
		
		int[] answer = new int[q];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = sc.nextInt();
			point[answer[i] - 1]++;
		}
		
		for (int i : point) {
			if (i <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
		
	}
}