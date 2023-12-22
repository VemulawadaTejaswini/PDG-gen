import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bus = sc.next();
		sc.close();

		if(bus.charAt(0) == bus.charAt(1)) {
			if(bus.charAt(1) == bus.charAt(2)) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}else {
			System.out.println("Yes");
		}
	}
}