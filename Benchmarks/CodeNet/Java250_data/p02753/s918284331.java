import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s=scan.nextLine();
		if(s.contains("A")&& s.contains("B")) System.out.println("Yes");
		else System.out.println("No");
	}

}
