import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n<1200) {
			System.out.println("ABC");
			return;
		}else if(n<2800) {
			System.out.println("ARC");
			return;
		}else {
			System.out.println("AGC");
		}
	}
}
