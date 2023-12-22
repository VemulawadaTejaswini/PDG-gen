import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		if(s.equals("ABC")) 
		{
			s=s.replace("ABC", "ARC");
		}
		else
		{
			s=s.replace("ARC", "ABC");
		}
		System.out.println(s);
	}

}
