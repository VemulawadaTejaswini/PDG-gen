import java.util.Scanner;

class Main1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true){
			//??\???
			
			int W = scan.nextInt();
			int H = scan.nextInt();
			//??????
			
			if(W == 0 && H == 0)break;
			
			for (int i = 0; i < W; i++) {
				int j = 0;
				for (; j < H; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.print("\n");
		}
	}
}