import java.util.Scanner;
public class Print{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		while(true){
			int i,j;
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0&&W==0){
				break;
			}
			for(i=0;i<H;i++){
				if(i%2==0){
				for(j=0;j<W;j++){
					if(j%2==0){
					System.out.printf("#");
				             }
				     else{
				      
				    System.out.printf(".");
				         }
				     }
				     System.out.printf("\n");
				if(i%2==1){
				for(j=0;j<W;j++){
					if(j%2==0){
					System.out.printf(".");
				             }
				     else{
				      
				    System.out.printf("#");
				         }
				     }
				    System.out.printf("\n"); 
			      }
			  }
			}
			      System.out.printf("\n");

		}
	}
}