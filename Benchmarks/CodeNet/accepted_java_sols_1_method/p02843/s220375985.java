import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			int x = sc.nextInt();
			for(int i = 0 ; i <= x / 100 ; i++) {
				for(int j = 0 ; j <= x / 101 ; j++) {
					for(int k = 0 ; k <= x / 102 ; k++) {
						for(int l = 0 ; l <= x / 103 ; l++) {
							for(int m = 0 ; m <= x / 104 ; m++) {
								for(int n = 0 ; n <= x / 105 ; n++) {
									if((i * 100 + j * 101 + k * 102 + l * 103 + m * 104 + n * 105) == x) {
										System.out.println(1);
										return;
									}
								}
							}
						}
					}
				}
			}
			System.out.println(0);

		}

	}

}
