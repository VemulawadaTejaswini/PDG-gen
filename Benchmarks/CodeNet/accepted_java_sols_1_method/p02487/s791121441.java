import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0)
				break;
			for(i = 0; i < w; i++){
				System.out.printf("#");
			}
			System.out.printf("\n");
			for(i = 0; i < h - 2; i++){
				System.out.printf("#");
				for(j = 0; j < w - 2; j++){
					System.out.printf(".");
				}
				System.out.printf("#\n");
			}
			for(i = 0; i < w; i++){
				System.out.printf("#");
			}
			System.out.printf("\n\n");
		}	
	}
}