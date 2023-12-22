import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(true){
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0 && num2 == 0){
				break;
				
			}
			else{
				System.out.println(Math.min(num1,num2) + " " + Math.max(num1,num2));
			}
		}
	}
}