import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	
	public static Scanner sc = new Scanner(System.in);
	
	void run() {
		int a, b, c;
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			System.out.println(Integer.toString(c).length());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}