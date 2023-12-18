import java.util.Scanner;

public class Main {
	private Scanner sc;

	int[][] path;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int x = Integer.parseInt(sc.nextLine());
			int h = Integer.parseInt(sc.nextLine());
			if ((x == 0) && (h == 0)) break;
			
			System.out.println(x * x + x * Math.sqrt((x / 2.0) * (x / 2.0) + h * h) * 2);
		}
	}
}