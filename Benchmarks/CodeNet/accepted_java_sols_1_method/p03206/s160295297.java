import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if(N==25) {
			System.out.println("Christmas");
		}
		if(N==24) {
			System.out.println("Christmas Eve");
		}
		if(N==23) {
			System.out.println("Christmas Eve Eve");
		}
		if(N==22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}
