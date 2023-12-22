import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		
		if(c>=65 && c<=90) {
			System.out.println("A");
		}
		else
			System.out.println('a');
	}

}
