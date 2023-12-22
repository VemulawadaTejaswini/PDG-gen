import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int H,W;
		int count1=0;
		int count2=0;
		int count3=0;
		
		
		while(true){
			H = as.nextInt();
			W = as.nextInt();
			
			if(H==0 && W==0){
				
				break;
				
			}
			
			for(int i=0;i<H;i++){
				
				if(i==2*count1){
					
					for(int j=0;j<W;j++){
						
						if(j==2*count2){
							
							System.out.print("#");
							
						}
						
						else{
							
							System.out.print(".");
							count2++;
							
						}
					}
					count2=0;
				}
				
				else{
					
					for(int j=0;j<W;j++){
					
						if(j==2*count2){
							
							System.out.print(".");
							
						}
						
						else{
							
							System.out.print("#");
							count2++;
							
						}
						
					}
					count2=0;
					count1++;
				}
				
				System.out.println();
				
				
			}
			
			System.out.println();
			count1=0;
		}
		
		

	}

}