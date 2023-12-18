import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String string = cin.next();
		System.out.print(string.substring(0, 4) + " ");
		System.out.println(string.substring(4));
	} 
}