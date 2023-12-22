import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int h = 60 * 60;
		int m = 60;
		stdIn.close();
		System.out.printf("%d:%d:%d\n",x/h,x%h/m,x%h%m);

	}

}
