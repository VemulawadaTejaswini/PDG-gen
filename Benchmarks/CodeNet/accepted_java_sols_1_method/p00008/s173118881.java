import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()) {
			int c = 0;
			int n = s.nextInt();
			for (int i = 0; i <= 9; ++i) {
				for(int j = 0; j <= 9; ++j) {
					for(int k = 0; k <= 9; ++k) {
						for(int l = 0; l <= 9; ++l) {
							int sum = i + j + k + l;
							if(n == sum) {
								c++;
								break;
							} else if (n < sum) {
								break;
							}
						}
					}
				}
			}
			System.out.println(c);
		}
	}
}