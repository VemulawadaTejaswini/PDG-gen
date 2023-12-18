import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int H = sc.nextInt();
			int W = sc.nextInt();
			int syoki;
			
			
			if(H == 0 && W == 0)break;
			
			for(int i = 1;i <= H;i++) {
				
				    //初期値が奇数の時シャープから
				
				if(i % 2 == 1) {
					syoki = 1;
					
				}else{
					syoki = 0;
				}
				
				int a = syoki;
				
				
				for(int j = a;j <= (W -1 + a);j++) {
					
					if(j % 2 == 1) {
						System.out.print("#");
						
					}else {
						System.out.print(".");
						
					}
					
					
				}
				
				System.out.println("");
				
			}
			
			System.out.println("");
			
			
		}
				
	}
}
