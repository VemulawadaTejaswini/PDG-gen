public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt(); 
		int i;
	
		if(3 <= n && n <= 10000){
			for(i = 1; i <= n; i++){
				if(i % 3 == 0 || i % 10 == 3 || i/10 % 10 == 3 || i/100 % 10 == 3 || i/1000 % 10 == 3){
					
				System.out.print(" "+ i);
				}
				}
	
		}
		System.out.println();
		
		}
			
			
		}