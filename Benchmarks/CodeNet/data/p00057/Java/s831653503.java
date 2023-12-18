import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int nico = Integer.parseInt(sc.nextLine());
			
			int sum = 2;
			for (int i = 1; i < nico; i++) {
				sum = sum + i + 1;
			}
			System.out.println(sum);
		}
	}
}