import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int n, x, t;
 
		n = sc.nextInt();
		x = sc.nextInt();
		t = sc.nextInt();
 
		int cook = (int) Math.ceil((double) n / (double) x);
 
		System.out.println(cook * t);
 
		sc.close();
	}
 
}