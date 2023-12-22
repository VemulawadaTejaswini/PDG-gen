import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, W;

		while(true) {
			H = sc.nextInt();
			W = sc.nextInt();

			if(H == 0 && W == 0) {
				sc.close();
				break;
			}

			for(int hight_count = 0; hight_count < H; hight_count++) {
				for(int witdh_count = 0; witdh_count < W; witdh_count++) {
					if(hight_count % 2 == 0 && witdh_count % 2 == 0) {
						System.out.printf("#");
					} else if(hight_count % 2 == 0 && witdh_count % 2 == 1) {
						System.out.printf(".");
					} else if(hight_count % 2 == 1 && witdh_count % 2 == 0) {
						System.out.printf(".");
					} else if(hight_count % 2 == 1 && witdh_count % 2 == 1) {
						System.out.printf("#");
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}

