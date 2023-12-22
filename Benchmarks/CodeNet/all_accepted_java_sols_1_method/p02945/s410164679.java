import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int a = A+B;
		int b = A-B;
		int c = A*B;
		if(a >=b && a >= c) {
			System.out.println(a);
		}else if(b>=c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}