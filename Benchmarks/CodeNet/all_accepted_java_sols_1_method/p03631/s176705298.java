import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		if(n.charAt(0)==n.charAt(2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
