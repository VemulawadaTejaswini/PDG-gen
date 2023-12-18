
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// two integers
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int products =  a * b;
		if(products%2 == 0){
		System.out.println("Even");
		} else{
		System.out.println("Odd");	
		}
		

	}

}
