import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c[] = sc.nextLine().toCharArray();
		
		int num1 = Character.getNumericValue(c[0]);
		
		int num2 = Character.getNumericValue(c[1]);

		int num3 = Character.getNumericValue(c[2]);
		
		int count = 0;
		
		if(num1 == 1){
			count++;
		}
		
		if(num2 == 1){
			count++;
		}
		
		if(num3 == 1){
			count++;
		}
		
		System.out.println(count);
		
	}

}
