import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int debt = 100000;
		for (int i = 0; i < n; i++) {
			debt *= 1.05;
			if (debt % 1000 > 0) {
				debt = (int)(debt / 1000) * 1000  + 1000;
				//System.out.println(debt);
			}
		}
		
		System.out.println(debt);
	}
}