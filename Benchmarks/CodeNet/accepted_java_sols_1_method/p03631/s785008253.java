import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		StringBuilder s= new StringBuilder(s1);
		s.reverse();
		if(s1.contains(s)) System.out.println("Yes");
		else System.out.println("No");

	}

}
