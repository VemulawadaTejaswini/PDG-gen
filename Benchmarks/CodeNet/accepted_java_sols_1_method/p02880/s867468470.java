import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			
			int ok = 0;
			
			
			for(int i = 1;i<=9;i++) {
				
				
				if(N%i==0) {//割り切れるとは二つの席で表せる
					String s = String.valueOf(N/i);
					if(s.length()==1) {//さらにもう一つの席が人桁かどうか
						ok=1;
						break;
					}
					
				}
			}
			
			
			System.out.println(ok==1?"Yes":"No");
			
			
			
			
			
			
			
		}
		
		
	}
		

}
