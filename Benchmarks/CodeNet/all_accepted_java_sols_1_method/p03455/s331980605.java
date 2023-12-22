import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer num1 = Integer.parseInt(sc.next());
		Integer num2 = Integer.parseInt(sc.next());
		
		Integer ans = num1 * num2;
		
		if (ans % 2 == 0){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}

