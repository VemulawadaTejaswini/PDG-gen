import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = Integer.parseInt(s.next());
		int num2 = Integer.parseInt(s.next());
		int sub;
		
		if(num2 > num1){
			sub = num2;
			num2 = num1;
			num1 = sub;
		}
		
		System.out.println(num1 != num2 ? gcd(num1, num2) : num1);
	}
	
	public static int gcd(int num1, int num2){
		int sub = num1;
		num1 = Math.max(num1 - num2, num2);
		num2 = Math.min(sub - num2, num2);
		if(num1 != num2){
			return gcd(num1, num2);
		}else{
			return num2;
		}
	}

}