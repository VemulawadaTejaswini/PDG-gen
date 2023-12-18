import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
		int ans = (x - z) / (y + z);
		System.out.println(ans);
	}

}
