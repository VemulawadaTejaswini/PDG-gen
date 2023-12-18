import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str.toUpperCase());
	}
}