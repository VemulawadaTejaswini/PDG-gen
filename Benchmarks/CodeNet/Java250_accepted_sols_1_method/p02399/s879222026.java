import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		System.out.printf("%d %d %f\n",a/b,a%b,(double)a/b);
	}
}