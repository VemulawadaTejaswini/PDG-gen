import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){
			int h = scan.nextInt();
			int w = scan.nextInt();

			if(h == 0 && w == 0){
				 break;
			}else{
				for(int a = 0; a < h; a++){
					for(int b = 0; b < w; b++){
						if(a % 2 == 0){
							if(b % 2 == 0){
								System.out.print("#");
							}else{
								System.out.print(".");
							}
						}else{
							if(b % 2 == 0){
								System.out.print(".");
							}else{
								System.out.print("#");
							}
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}
}