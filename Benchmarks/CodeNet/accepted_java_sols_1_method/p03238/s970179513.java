import java.util.Scanner;


public class Main{

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		if(age == 1) {
			System.out.println("Hello World");
		}else if(age == 2) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a + b);
		}
		
		
	}

}