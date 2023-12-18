import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cards[] = new int[n];
		int bobSum = 0;
		int aliceSum = 0;
		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}
		Arrays.sort(cards);
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			if(count % 2 == 0) {
				aliceSum += cards[i];
			} else {
				bobSum += cards[i];
			}
			count++;
		}
		System.out.println(aliceSum - bobSum);
	}

}
