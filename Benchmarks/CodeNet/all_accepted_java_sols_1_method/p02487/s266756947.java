import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		while(h != 0 && w != 0){
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(i == 0 || i == h - 1){
						System.out.print("#");
					}else if(j == 0 || j == w - 1){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			h = sc.nextInt();
			w = sc.nextInt();
		}
	}
}