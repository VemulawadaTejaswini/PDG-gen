import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int min = 2018;
		if (R - L > 2019) {
			System.out.print(0);
		} else {
			int LMod = Math.floorMod(L, 2019);
			int RMod = Math.floorMod(R, 2019);
			if (LMod < RMod) {
				for (int i = LMod; i < RMod; i++) {
					for (int j = i + 1; j <= RMod; j++) {
						int surPlus = (i * j) % 2019;
						if (surPlus < min) {
							min = surPlus;
						}
					}
				}
				System.out.print(min);
			} else {
				System.out.print(0);
			}
		}
	}
}
