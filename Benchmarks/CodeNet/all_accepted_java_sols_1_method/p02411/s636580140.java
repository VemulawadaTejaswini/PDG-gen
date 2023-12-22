import java.util.Scanner;

class Main {

	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int m = 0, f = 0, r = 0;
		while(true){
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			
			if(m == -1 && f == -1 && r == -1)break;
			
			if(m >= 0 && f >= 0){
				if(m + f >= 80){
					System.out.println("A");
				}else if(m + f < 80 && m + f >= 65){
					System.out.println("B");					
				}else if(m + f < 65 && m + f >= 50 || r >= 50){
					System.out.println("C");
				}else if(m + f < 50 && m + f >= 30){
					System.out.println("D");
				}else if(m + f < 30){
					System.out.println("F");
				}
			}else{
				System.out.println("F");
			}
		}
		
		
	}
}	