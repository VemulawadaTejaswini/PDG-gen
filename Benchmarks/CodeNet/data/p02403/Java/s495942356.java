import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();

		while(true) {
			if(H == 0 && W == 0) {
				break;
			}

			for(int i = 0; i < H; i++) {
				for(int j = 1; j < W; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}