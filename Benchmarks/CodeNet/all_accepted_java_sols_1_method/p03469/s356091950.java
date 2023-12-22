import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		
		c[3] = '8';
		
		String st = new String(c);
		System.out.println(st);
	}
}