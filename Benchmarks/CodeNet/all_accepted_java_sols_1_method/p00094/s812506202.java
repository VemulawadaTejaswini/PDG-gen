import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String[] nico = sc.nextLine().split(" ");
		int a = Integer.parseInt(nico[0]);
		int b = Integer.parseInt(nico[1]);
		
		System.out.println(a * b / 3.305785);
	}
}