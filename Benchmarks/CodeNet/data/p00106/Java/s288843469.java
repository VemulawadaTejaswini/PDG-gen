import java.util.Scanner;

public class Main {
	
	static int min_price;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int g = scanner.nextInt();
		while (g != 0) {
			min_price = Integer.MAX_VALUE;
			calculate(0, 0, 0, g);
			System.out.println(min_price);
			g = scanner.nextInt();
		}
	}
	
	private static void calculate(int num_A, int num_B, int num_C, int gram) {
		if (gram == 0) {
			int dis_A = (num_A / 5) * 5;
			int dis_B = (num_B / 4) * 4;
			int dis_C = (num_C / 3) * 3;
			int price = (dis_A * 380 * 80 / 100) + (num_A - dis_A) * 380 + (dis_B * 550 * 85 / 100) + (num_B - dis_B) * 550 + (dis_C * 850 * 88 / 100) + (num_C - dis_C) * 850;
			if (min_price > price) {min_price = price;}
			return;
		} else if (gram < 0) {
			return;
		}
		
		calculate(num_A, num_B, num_C + 1, gram - 500);
		calculate(num_A, num_B + 1, num_C, gram - 300);
		calculate(num_A + 1, num_B, num_C, gram - 200);
	}
}