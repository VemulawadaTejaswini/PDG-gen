import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		StringBuilder s1= new StringBuilder(t);
		s1.reverse();
		if(s.contains(s1)) System.out.println("YES");
		else System.out.println("NO");

	}

}
