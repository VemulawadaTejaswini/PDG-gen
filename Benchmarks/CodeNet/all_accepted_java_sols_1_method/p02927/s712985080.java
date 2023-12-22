import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			int inputM = scan.nextInt();
			if (inputM < 4 ) {
             	 System.out.println("0");
				return;
            }
			int inputD = scan.nextInt();

			int ans = 0;
			int D1 = inputD / 10;
			int D2 = inputD % 10;
			for (int i = 2; i <= D1; i++) {
				if (i != D1) {
					if (inputM > i * 9) {
						ans += 9 - 1;
					} else {
						int calc = inputM / i;
						if (calc > 9)
							calc = 9;
						ans += calc - 1;
					}
				} else {
					if(D2 > 1) {
						if (inputM > i * D2) {
							ans += D2 - 1;
						} else {
							int calc = inputM / i;
							if (calc > D2)
								calc = D2;
							ans += calc - 1;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

}