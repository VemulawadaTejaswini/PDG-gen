import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int H,W;
		do{
			H = scan.nextInt();
			W = scan.nextInt();
			if(H == 0 && W == 0){break;} // H = 0 W = 0 ??§??????
			for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++){
					if(i == 0 || i == H - 1|| j == 0 || j == W - 1){
					System.out.print("#");
					}
					else{
					System.out.print(".");
					}
				}
					System.out.print("\n");
			}
			System.out.print("\n");	
		}while(true);
	}
}