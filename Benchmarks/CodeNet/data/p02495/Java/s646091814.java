import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int h, w;
		int i, j;
		for (;;){
			h = scn.nextInt();
			w = scn.nextInt();
			if (h == 0 && w == 0) break;
			
			for (i = 0; i < h; i++){
				for (j = 0; j < w; j++){
					if ((i + j) % 2 == 0){
						System.out.print("#");
					}
					else {
						System.out.print(".");
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		scn.close();
	}
}