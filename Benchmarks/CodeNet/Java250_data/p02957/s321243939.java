import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ab = a+b;
		if(ab%2==1) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(ab/2);
		}
		sc.close();
	}
}
