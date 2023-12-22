import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int result;

		int a = p+q;
		int b = q+r;
		int c = r+p;

		if(a<=b) {
			result = a;
			if(c<=a) {
				result = c;
			}
		}else {
			result = b;
			if(c<=b) {
				result = c;
			}
		}

		System.out.println(result);
	}

}
