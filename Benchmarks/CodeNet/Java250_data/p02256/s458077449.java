import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i, j, k;
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x >= y) gcd(x, y);
		else gcd(y, x);
	}
	
	public static void gcd(int x, int y){
		int r = 0;
		if(y != 0){
			r = x % y;
			gcd(y, r);
		}
		else System.out.println(x);
	}
}
