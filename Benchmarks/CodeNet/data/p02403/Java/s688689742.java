import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true){
			//??\???
			int H = scan.nextInt();
			int W = scan.nextInt();
			//??????
			if(W == 0 && H == 0)break;
			String[] hako = new String[H];
			
			for (int i = 0; i < W; i++) {
				int j = 0;
				for (; j < H; j++) {
					hako[j] = "#";
					System.out.print(hako[j]);
				}
				System.out.println(" ");
			}
		}
	}
}