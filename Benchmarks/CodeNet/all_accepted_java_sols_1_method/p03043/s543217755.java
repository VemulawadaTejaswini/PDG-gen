import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			double kakuritu= 0;
			
			
			for(int i=1;i<=N;i++){
				if(i>=K) {
					
					kakuritu+=(1.0/(double)N);
					//System.out.println("o-i");
				}else{
					//if(2*i>=K) {
						//kakuritu+=(1.0/(double)N)*(0.5);
					//}else{
					
					int nankai =0;
					int idash=i;
					while(true) {
						idash  = 2*idash;
						nankai++;
						
						//System.out.println(idash);
						//System.out.println();
						//System.out.println(nankai);
						
						if(K<=idash){
							break;
						}
						
						
					}
					
					//System.out.println(BigDecimal.valueOf((1.0/(double)N)*Math.pow(0.5, nankai)).toPlainString());
					//System.out.println();
					kakuritu+=(1.0/(double)N)*Math.pow(0.5, nankai);
				
					
				}
			}
			
			
			System.out.println(BigDecimal.valueOf(kakuritu).toPlainString());
			
			
			
			
			
		}
		
		
	}
		

}
