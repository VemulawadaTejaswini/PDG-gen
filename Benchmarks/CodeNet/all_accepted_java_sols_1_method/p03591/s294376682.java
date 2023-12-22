import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		if(s.length()<4) {
			System.out.println("No");
			return;
		}
		if(s.substring(0,4).equals("YAKI"))  System.out.println("Yes");
		else System.out.println("No");
	}
}