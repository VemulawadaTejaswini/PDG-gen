import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		c++;
		System.out.println(c);
		sc.close();
	}
}
