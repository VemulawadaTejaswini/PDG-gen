import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();

		int temp;

		temp = x;
		x = y;
		y = temp;

		temp = x;
		x = z;
		z = temp;
		System.out.println(x + " " + y + " " + z);
	}
}