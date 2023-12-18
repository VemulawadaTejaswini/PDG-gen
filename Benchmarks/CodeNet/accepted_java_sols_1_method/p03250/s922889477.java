import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max = a;
		int r = 10 * a + b + c;
		if (b > max){
			max = b;
			r = 10 * b + a + c;
		}
		if (c > max){
			max = c;
			r = 10 * c + a + b;
		}
		System.out.println(r);

	}

}