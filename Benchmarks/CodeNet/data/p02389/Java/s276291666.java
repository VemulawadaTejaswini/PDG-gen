import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d = x * y;
		int u = (x * 2 + y * 2);
		System.out.println(d + " " + u);
	}
}

