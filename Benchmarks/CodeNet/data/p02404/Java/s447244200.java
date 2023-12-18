import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		
		int H, W;
		
		for(;;){

			H = scan.nextInt();
			W = scan.nextInt();
			
			if(H == 0 && W == 0){
				break;
			}
			for(int i = 0; i < H; i++){
				if(i == 0 || i == H - 1){
					sharpLine(W);
				}else{
					sharpDotLine(W);
				}
			}
			System.out.println();
		}
	}
	
	static void sharpLine(int w){
		for(int i = 0; i < w; i++){
			System.out.print("#");
		}
		System.out.println();
	}
	
	static void sharpDotLine(int w){
		for(int i = 0; i < w; i++){
			if(i == 0 || i == w - 1){
				System.out.print("#");
			}else{
				System.out.print(".");
			}
		}
		System.out.println();
	}
}