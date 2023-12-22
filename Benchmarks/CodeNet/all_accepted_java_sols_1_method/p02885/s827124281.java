import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int out = 0;
		out = A - 2*B;
		if(out <0) {
			out = 0;
		}
		System.out.println(out);
	}

}
