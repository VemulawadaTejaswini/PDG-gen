import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a = sc.next();
		
		int c = 0;
		if(s.charAt(0)==a.charAt(0))c++;
		if(s.charAt(1)==a.charAt(1))c++;
		if(s.charAt(2)==a.charAt(2))c++;
		
		System.out.println(c);
	}
}
