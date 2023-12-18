import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for(;;){

			int H = scan.nextInt();
			int W = scan.nextInt();

			if(H == 0 && W == 0){

				scan.close();
				break;
			}
			for(int i=0; i<H; i++){ //縦の列の繰り返し

				for(int s=0; s<W; s++){ //横の行の繰り返し

					if(i == 0 | i == H-1){ //1行または最終行の指定
						System.out.print("#");
					}else if(s == 0 | s == W-1){ //1列または最終列の指定

						System.out.print("#");
					}else{
						
						System.out.print(".");
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}