import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Integer num = Integer.valueOf(new Scanner(System.in).nextLine());
		int min = Integer.MAX_VALUE;
		for (Integer a = num - 1, b = 1; a > 0 && b < num; a--, b = num - a) {
			int sum = 0;
			for (Integer ta = a, tb = b; ta > 0 || tb > 0; ta /= 10, tb /= 10) {
				sum += ta % 10;
				sum += tb % 10;
			}
			min = Integer.min(min, sum);
		}
		System.out.println(min);
	}
}