import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		String n1 = scan.next();
		String n2 = scan.next();
		
		Integer a = new Integer(n1);
		Integer b = new Integer(n2);
	
		int side = 2*(a+b);
		int area = a*b;
		
		System.out.println(area + " " +side);

		
	}
}