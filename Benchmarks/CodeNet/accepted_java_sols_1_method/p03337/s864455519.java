import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int a =Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		sc.close();

		int x = a+b;
		int y = a-b;
		int z = a*b;
		if (x>=y && x>=z)
			System.out.println(x);
		else if (y>=x && y>=z)
			System.out.println(y);
		else
			System.out.println(z);
	}
}
