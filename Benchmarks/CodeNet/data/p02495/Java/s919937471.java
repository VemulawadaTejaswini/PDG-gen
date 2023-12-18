import java.util.Scanner;
public class printachessboard{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j;
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0 && W==0){
				break;
			}
			for(j=0;j<H;j++){
				if(j%2==0){
					if(W%2==1){
						for(i=0;i<W/2;i++){
							System.out.printf("#.");
						}
						System.out.printf("#");
					}else{
						System.out.printf("#.");
					}
				}else{
					if(W%2==1){
						for(i=0;i<W/2;i++){
							System.out.printf(".#");
						}
						System.out.printf(".");
					}else{
						System.out.printf(".#");
					}
				}
				System.out.printf("\n");
			}
		}
	}
}