import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt();
		int min = x*a+y*b;
		min = Math.min(min, 2*y*c+Math.max(0,x-y)*a);
		min = Math.min(min, 2*x*c+Math.max(0,y-x)*b);
		min = Math.min(min, 2*Math.max(x,y)*c);
		System.out.println(min);
		sc.close();
	}
}