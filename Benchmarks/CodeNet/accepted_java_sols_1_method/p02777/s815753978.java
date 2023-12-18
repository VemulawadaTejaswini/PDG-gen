import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		String s1 = scan.next();
		String s2 = scan.next();
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(scan.next().equals(s1))n1--;
		else n2--;
		
		System.out.println(n1 + " " + n2);
	}
}