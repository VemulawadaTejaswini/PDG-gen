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
			for(int i=0; i<H; i++){

				for(int s=0; s<W; s++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.print("\n");
		}
	}
}