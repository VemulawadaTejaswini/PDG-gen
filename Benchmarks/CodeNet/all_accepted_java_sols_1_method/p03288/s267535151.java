import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int R=sc.nextInt();
			if(R<1200) System.out.println("ABC");
			else if(R<2800) System.out.println("ARC");
			else System.out.println("AGC");

		}
	}
}