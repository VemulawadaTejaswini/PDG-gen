import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, x, x_a, x_b, x_c;
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				n = sc.nextInt();
				x = sc.nextInt();
				int counter = 0;
				if(n == 0 && x == 0) {
					break;
				}
				for(int i = 1; i < x - 2; i++) {
					for(int j = 1; j < x - 2; j++) {
						for(int k = 1; k < x - 2; k++) {
							x_a = i;
							x_b = j;
							x_c = k;
							if(x_a + x_b + x_c == x) {
								if(x_a <= n && x_b <= n && x_c <= n) {
									if(x_a != x_b && x_b != x_c && x_c != x_a) {
										counter++;
									}
								}
							}
						}
					}
				}
				System.out.println(counter / 6);
			}
		}
	}
}

