import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int space = a*b;
		int length = 2*(a+b);
		System.out.println(space+" "+length);
	}
}