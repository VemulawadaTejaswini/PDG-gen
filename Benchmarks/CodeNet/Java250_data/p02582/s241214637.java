import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			
		
			char one  = S.charAt(0);			
			char two  = S.charAt(1);			
			char thr  = S.charAt(2);
			
			
			int max = 0;
		
			if(one=='R') {
				
				max++;
				if(two=='R') {
					max++;
					if(thr=='R') {
						max++;
					}else {
						
					}
				}else {
					if(thr=='R') {
						
					}else {
						
					}
					
				}
			}else {
				if(two=='R') {
					max++;
					if(thr=='R') {
						max++;
					}else {
						
					}
				}else {
					if(thr=='R') {
						max++;
					}else {
						
					}
					
				}
			}
			
			
			System.out.println(max);
			
			
			
		}
		
	
		
	}
		

}
