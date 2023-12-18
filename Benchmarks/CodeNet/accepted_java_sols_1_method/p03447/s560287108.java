import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x,a,b,z;

		// 入力
		x = scanner.nextInt();
		a = scanner.nextInt();
		b = scanner.nextInt();

		z = x - a;
		while(z >= 0){
			z -= b;
		}
		z += b;

		System.out.println(z);

		scanner.close();
	}
}