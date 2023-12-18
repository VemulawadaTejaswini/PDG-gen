import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,result;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		result = a * b ;
		
		if( (result % 2) == 1) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
	}

}