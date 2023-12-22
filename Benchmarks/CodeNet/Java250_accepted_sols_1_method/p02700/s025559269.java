import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int health1 = scan.nextInt();
		int attack1 = scan.nextInt();
		
		int health2 = scan.nextInt();
		int attack2 = scan.nextInt();
		
		String hantei = "";
		
		for(;;) {
			health2 -= attack1;
			
			if(health1 <= 0 || health2 <= 0) {
				if(health1 <= 0) {
					hantei = "No";
					break;
				}else if(health2 <= 0){
					hantei = "Yes";
					break;
				}
			}
			
			health1 -= attack2;
			
			if(health1 <= 0 || health2 <= 0) {
				if(health1 <= 0) {
					hantei = "No";
					break;
				}else if(health2 <= 0){
					hantei = "Yes";
					break;
				}
			}
		}
		System.out.println(hantei);
		
		scan.close();
	}
}