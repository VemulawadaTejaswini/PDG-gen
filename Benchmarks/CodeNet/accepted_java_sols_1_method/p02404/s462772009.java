import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		while(true){

			int H = in.nextInt();
			int W = in.nextInt();

			if(H == 0 && W == 0){break;};

			for(int i = 0; i < H; i++){

				if(i == 0 || i == (H-1)){
					for(int k = 0; k < W; k++){
						System.out.print("#");
					}
				}else{
					System.out.print("#");
					for(int j = 0; j < (W-2); j++){
						System.out.print(".");
					}
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();

		}
	}
}

