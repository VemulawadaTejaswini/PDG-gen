import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int s = 0;
		while(true) {
			 s = scan.nextInt();
			if (s == 0) break;
			System.out.printf("case %d: %d\n", count, s);
			count+=1;
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}