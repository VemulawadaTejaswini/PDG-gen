import java.util.Scanner;

public class Main{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
	        int sum;
		int H,W;
		while(true){
			 H = sc.nextInt();
			 W = sc.nextInt();
			if(H == 0 && W == 0){
				break;
			}
		
		for(int i = 0; i < H; i++){
			for (int j = 0; j < W; j++){
				sum = i+j;
				if(sum % 2 == 0){
  					System.out.printf("#");
				}else{
					System.out.printf(".");
				}

			}
			System.out.printf("\n");
		}
	    System.out.printf("\n");
	}
	}
}