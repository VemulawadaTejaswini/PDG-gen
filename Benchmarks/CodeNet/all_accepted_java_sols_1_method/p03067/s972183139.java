import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt() , c = sc.nextInt();
		if(a > b) {
			int x = a;
			a = b;
			b = x;
		}
		if((a < c) && (c < b)) System.out.println("Yes");
		else System.out.println("No");
	}
}