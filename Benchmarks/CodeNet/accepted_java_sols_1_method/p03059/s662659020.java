import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int T = 0;
		Scanner sc = new Scanner(System.in);
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		T = Integer.parseInt(sc.next());
		int count=0;
		count=T/A*B;
		System.out.println(count);
	}

}