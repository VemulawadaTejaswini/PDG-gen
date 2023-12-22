import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner src = new Scanner(System.in);
		int bad = -1;
		
		while(true) {
			
			
			int m = src.nextInt();
			int f = src.nextInt();
			int r = src.nextInt();
			
			int sum = m + f;
			
			if((m == bad) && (f == bad) && (r == bad)){
				
				break;
				
			}else if((sum < 30) || (m == bad) || (f == bad)) {
				
				System.out.println("F");
				
			}else if(80 <= sum) {
				
				System.out.println("A");
				
			}else if((65 <= sum) && (sum < 80)) {
				
				System.out.println("B");
				
			}else if((50 <= sum) && (sum < 65) || (50 <= r)) {
				
				System.out.println("C");
			
			}else if((30 <= sum) && (sum < 50)) {
				
				System.out.println("D");
				

			}	
		}
		

	}
}


