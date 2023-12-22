import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		
		tmp = a;
		a = c;
		c = tmp;
		
		System.out.println(a + " " + b + " " + c);
		

		scanner.close();
	}

}
