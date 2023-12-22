import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
      	int ans = a > b ? a * 2 - 1
          		: a < b ? b * 2 - 1
                : a + b;
      	System.out.println(ans);
	}
}
