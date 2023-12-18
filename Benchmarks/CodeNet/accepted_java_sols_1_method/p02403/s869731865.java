import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int H = 0;
		int W = 0;
		int i = 0;
		int j = 0;
		String str = null;
		String[] split = new String[2];

		while(true){
			str = scan.nextLine();
			split = str.split(" ");
			H = Integer.parseInt(split[0]);
			W = Integer.parseInt(split[1]);
			if(H == 0 && W == 0){
				break;
			}
			for(i = 0; i < H; i++){
				for(j = 0; j < W; j++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
			System.out.println();
		}
	}
}
