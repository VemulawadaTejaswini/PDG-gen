import java.util.Scanner;

class AOJ10012 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		for (;;){
			int w = scan.nextInt();
			int h = scan.nextInt();
			if (w + h == 0) break;
			
			for (int i = 0; i < w; i++){
				for (int j = 0; j < h; j++){
					System.out.printf("#");
				}
				System.out.println();
			}
		}
	}
}