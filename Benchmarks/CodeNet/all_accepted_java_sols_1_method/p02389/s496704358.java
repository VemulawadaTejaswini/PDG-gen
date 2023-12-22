import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dis = 2*a+2*b;
		int are = a*b;
		System.out.println(are+" "+dis);
	}
}