import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int originalmoney = 800*x;
		int divider = 200*(x/15);
		System.out.println(originalmoney-divider);
	}
}