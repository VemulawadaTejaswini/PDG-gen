import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\????????????
		Scanner sc = new Scanner(System.in);

		// ?????°?????????
		int cnt1 = 0;
		int cnt2 = 0;

		while(true) {

			int H = sc.nextInt();
			int W = sc.nextInt();

			if(H == 0 && W == 0) {

				
				break;

			} else {

				for(cnt1 = 0; cnt1 < H; cnt1++ ) {

					for(cnt2 = 0; cnt2 < W ; cnt2++ ) {
						System.out.print("#");
					}
				System.out.println("");

				}
			}
			
			System.out.println("");

		}

		sc.close();

	}

}