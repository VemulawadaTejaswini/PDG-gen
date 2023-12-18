import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	String s=scan.next();
	char c=s.charAt(0);
		if(Character.isUpperCase(c))
		{
			System.out.println("A");
		}
		else if(Character.isLowerCase(c))
		{
			System.out.println("a");
		}
	}