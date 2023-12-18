import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			Integer a = scan.nextInt();
			System.out.println( a + scan.nextInt());
		}
	}
}