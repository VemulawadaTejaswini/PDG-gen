import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ch = sc.next();
		
		if(ch.charAt(0)>=65 && ch.charAt(0)<=90)
			System.out.println("A");
		
		else if(ch.charAt(0)>=97 && ch.charAt(0)<=122)
			System.out.println("a");
	}

}