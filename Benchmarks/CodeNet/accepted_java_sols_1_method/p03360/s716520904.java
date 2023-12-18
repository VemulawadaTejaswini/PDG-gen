import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int K = sc.nextInt();
		
		int[] array = {a, b, c};
		int max = 0;
		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		int answer = 0;
		int x = (int) Math.pow(2, K) * max;
		boolean twice = false;
		for (int j : array) {
			if (max == j && !twice) {
				answer += x;
				twice = true;
			} else {
				answer += j;
			}
		}
		System.out.println(answer);
	}
}