import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		
		int t = (c.length - 2);
		
		System.out.print(c[0]);
		System.out.print(t);
		System.out.print(c[c.length -1]);
		
	}
}