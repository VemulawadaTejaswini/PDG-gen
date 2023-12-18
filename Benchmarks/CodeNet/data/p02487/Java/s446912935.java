import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
		
		int H=sc.nextInt();
		int W=sc.nextInt();
		if(H==0 && W==0){
			break;
		}
			for(int i=0;i<H;i++){
				if(i==0||i==H-1){
					for(int j=0;j<W;j++){
						System.out.printf("#");
					}
					System.out.printf("\n");
					
				}else{
					System.out.printf("#");
					for(int k=0;k<W-2;k++){
						System.out.printf(".");
					}
					System.out.printf("#");
				        System.out.printf("\n");
			}
			
		}
		}
	}
}