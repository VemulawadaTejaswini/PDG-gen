import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String p = "A";
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(",");
			if (nico[0].equals(p)) p = nico[1];
			else if (nico[1].equals(p)) p = nico[0];
		}
		
		System.out.println(p);
	}
}