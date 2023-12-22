import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H,W;
		while(true){
			H= sc.nextInt();
			W = sc.nextInt();
			
			if(H == 0 && W == 0)
				break;
			
			for(int i = 1;i <= H;i++){
				if(i % 2 == 1){
					for(int j = 1;j <= W;j++){
						if(j % 2 == 1)
							System.out.print("#");
						else
							System.out.print(".");
					}
				}else{
					for(int j = 1;j <= W;j++){
						if(j % 2 == 1)
							System.out.print(".");
						else
							System.out.print("#");
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}