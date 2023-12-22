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
		
		int n=as.nextInt();
		int i=1;
		String str;
		
		while(true){
			int x=i;
			if(x % 3 == 0){
				str=" "+String.valueOf(i);
				System.out.print(str);
			
			}
			
			else if(x % 10 == 3){
				str=" "+String.valueOf(i);
				System.out.print(str);
			}
			
			else{
				while(true){
					x=x/10;
					if(x == 0){
						break;
					}
				
				
					if(x % 10 == 3){
						str=" "+String.valueOf(i);
						System.out.print(str);
						break;
					}
					
					
				
				}
				
			}
				 
			
			if(i++ >= n){
				System.out.println();
				break;
			}
			
		}
		
		
		
		
		
			

	}

}