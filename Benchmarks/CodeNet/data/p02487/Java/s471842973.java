import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			System.out.printf("\n");
			if (H == 0 && W == 0) {
				break;
			}

			for (int i = 1; i <= H; i++) {
			    if(i==1 || i==H){
				for (int j = 1; j <= W; j++) {
					System.out.printf("#");
				}
			    }else{
			        System.out.printf("#");
			        for(int j = 2;j<=W-1;j++){
			            System.out.printf(".");
			        }
			        System.out.printf("#");
			    }
				System.out.printf("\n");

			}
		}

	}
}