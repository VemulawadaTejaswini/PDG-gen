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
				if(i % 2 != 0){
					evenNumberLine(W);
				}else{
					oddNumberLine(W);
				}
			}
			System.out.println();
		}
	}
	
	static void evenNumberLine(int w){
		for(int i = 0; i < w; i++){
			if(i % 2 != 0){
				System.out.print("#");
			}else{
				System.out.print(".");
			}
		}
		System.out.println();
	}
	
	static void oddNumberLine(int w){
		for(int i = 0; i < w; i++){
			if(i % 2 == 0){
				System.out.print("#");
			}else{
				System.out.print(".");
			}
		}
		System.out.println();
	}
}