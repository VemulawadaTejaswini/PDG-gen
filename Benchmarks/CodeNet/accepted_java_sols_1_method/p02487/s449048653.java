import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0){
				break;
			}
			int h;
			int w;
			for (h=1; h<=H; h++) {
				for (w=1; w<=W; w++) {
					if(w==1 || w==W){
						System.out.printf("#");		
					}else{
						if (h==1 || h==H) {
							System.out.printf("#");
						}else{
							System.out.printf(".");
						}
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
	}
	
}
}