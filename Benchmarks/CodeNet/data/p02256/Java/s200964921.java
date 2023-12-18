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
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		
		int x,y;
		int i = 0;
		int big = 0;
		int sma = 0;
		
		x = Integer.parseInt(as.next());
		y = Integer.parseInt(as.next());
		
		if(x > y){
			
			big = x;
			sma = y;
	
		}
		else{
			
			big = y;
			sma = x;
			
		}
		
		for(i=big;i>=1;i--){
			
			if(big % i == 0 && sma % i == 0){
				
				break;
				
			}
			
		}
		
		if(i != 0){
			
			sb.append(String.valueOf(i));
		
		}
		else{
			
			sb.append(String.valueOf(1));
			
		}
		
		System.out.println(sb.toString());
	}

}