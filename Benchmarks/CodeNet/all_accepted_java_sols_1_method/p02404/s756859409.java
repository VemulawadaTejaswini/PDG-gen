import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int H,W,count;
		
		
		
		while(true){
			H = as.nextInt();
			W = as.nextInt();
			
			if(H==0 && W==0){
				
				break;
				
			}
			
			for(int i=0;i<H;i++){
				
				if(i==0 || i==H-1){
					
					for(int j=0;j<W;j++){
						
						System.out.print("#");
						
					}
					
				}
				
				else{
					
					for(int j=0;j<W;j++){
					
						if(j==0 || j==W-1){
							
							System.out.print("#");
							
						}
						
						else{
							
							System.out.print(".");
							
						}
						
					}
					
				}
				
				System.out.println();
				
			}
			
			System.out.println();
		}
		
		

	}

}