import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		int d = x / y;
		int r = x % y;
		double f = x / y;
		System.out.println(d + " " + r + " " + f );
	}
}