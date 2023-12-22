import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String circle = sc.next();
		String str = sc.next();
		sc.close();
		circle+=circle;
		if(circle.contains(str)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
