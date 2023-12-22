import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			long m = sc.nextInt();
			long f = sc.nextInt();
			long r = sc.nextInt();
			
			if(m == -1 && f == -1 && r == -1) break;
				
			String point = new String();
			
			if(m == -1 || f == -1) {
				point = "F";
				
			}else if(m + f >= 80) {
				point = "A";
				
			}else if(m + f >= 65) {
				point = "B";
				
			}else if(m + f >= 50) {
				point = "C";
				
			}else if(m + f >= 30) {
				if(r >= 50) {
					point = "C";
				}else {
					point = "D";
					
				}
				
			}else if(m + f >= 0) {
				point = "F";
				
			}
			
			System.out.println(point);
			
			
		}
			
		}

		

}
