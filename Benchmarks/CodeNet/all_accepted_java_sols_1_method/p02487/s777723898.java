import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		while(H != 0 || W != 0){
			if(H == 0 && W == 0){
				break;
			}
			if(H >= 3 && H <= 300 && W >= 3 && W <= 300) {
				for(int i = 0; i < W; i++) {
					System.out.print("#");
				}
				System.out.println("");
				for(int j = 1; j < H - 1; j++) {
					System.out.print("#");
					for(int k = 0; k < W - 2; k++) {
						System.out.print(".");
					}
					System.out.print("#");
					System.out.println("");
				}
				for(int i = 0; i < W; i++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}

}