import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		sc.close();

		//各和を比較
		int max = a + b;
		if(max > (b + c)) {
			max = b + c;
		}

		if(max > (c + a)) {
			max = c + a;
		}
		System.out.println(max);
	}
}