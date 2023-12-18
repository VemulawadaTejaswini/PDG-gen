import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int ani = in.nextInt();
		int leg = in.nextInt();
		
		if(ani * 4>= leg) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
