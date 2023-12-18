import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n,a,b;
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (n*a < b) {
			System.out.println(n*a);
		} else {
			System.out.println(b);
		}

	}

}