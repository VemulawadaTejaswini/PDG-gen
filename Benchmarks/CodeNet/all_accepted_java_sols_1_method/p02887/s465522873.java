import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			String S = scan.next();
			
		
			StringBuffer sc = new StringBuffer();
		
			
			if(N==1) {
				System.out.println(1);
			}else {
				sc.append(S.substring(0,1));
				
				for(int i = 1;i<=N-1;i++) {
					String s1 = S.substring(i-1, i);
				    String s2 = S.substring(i, i+1);
				    
				    if(s1.equals(s2)) {
				    	sc.append("X");
				    }else{
				    	sc.append(s2);
				    }
				}
				
				
				int count = 0;
				
				
				for(int i = 0;i<N;i++) {
					String s5 = sc.toString().substring(i, i+1);
					
					if(!s5.equals("X")) {
						count++;
					}
					
				}
				 
				System.out.println(count);
				
			
			
			}
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
