import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		int a = v.nextInt();
		int b = v.nextInt();
		int c = v.nextInt();
		int z = a;
		a = b;
		b = z;
		z = a;
		a = c;
		c = z;
		System.out.printf("%d %d %d",a,b,c);
	}
}
