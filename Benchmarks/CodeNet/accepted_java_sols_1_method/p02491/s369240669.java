import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		System.out.printf("%d %d %.6f\n", a / b, a % b, (double)a / b);
		return;
	}
}