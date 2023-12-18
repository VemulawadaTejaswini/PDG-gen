import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();

	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		int s = 0;
		int t = 0;
		for (int i = 0; i < 4; i++) {
			s += scan.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			t += scan.nextInt();
		}
		System.out.println(Math.max(s, t));
	}

}