import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int x;
		// scanf("%d",&x);
		x = scan.nextInt();
		
		// printf("%d",x*x*x);
		System.out.println(x*x*x);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
}