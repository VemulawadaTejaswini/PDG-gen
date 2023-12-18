import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = Integer.parseInt(s.next());
		int num2 = Integer.parseInt(s.next());
		int sub;
		if(num1 != num2){

			while(num1 != num2){
				sub = num2;
				num2 = num1 - num2;
				num1 = sub;
				if(num2 > num1){
					sub  = num1;
					num1 = num2;
					num2 = sub;
				}
			}
			
		}
		
		System.out.println(num1);
		
	}

}