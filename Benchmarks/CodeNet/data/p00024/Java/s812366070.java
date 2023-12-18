import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String str = "";
		while (sc.hasNextLine() == true) {
			str = sc.nextLine();
			double maxv = Double.parseDouble(str);
			double t = maxv / 9.8;
			
			double d = 4.9 * t * t;
			
			int f = (int)Math.ceil(d / 5) + 1;
			System.out.println(f);
		}
	}
}