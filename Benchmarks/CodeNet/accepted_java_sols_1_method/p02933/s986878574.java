import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		String s = sc.next();
		sc.close();

		if(a < 3200) {
			System.out.println("red");
		}else {
			System.out.println(s);
		}
	}
}