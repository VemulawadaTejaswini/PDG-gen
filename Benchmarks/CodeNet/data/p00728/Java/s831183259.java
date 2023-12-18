import java.util.*;

public class Main {
	public static void main (String[] args) {
		while (true) {
			Scanner Input = new Scanner(System.in);
			int num = Input.nextInt();
			
			if (num == 0);
			
			int a = 0;
			int b = 10000;
			int sum = 0;
			for (int i = 0; i < num; ++i) {
				int score = Input.nextInt();
				sum += score;
				a = Math.max(a, score);
				b = Math.min(b, score);
			}
			sum -= a; sum -= b;
			sum /= num - 2;
			System.out.println(sum);
		}
	}
}