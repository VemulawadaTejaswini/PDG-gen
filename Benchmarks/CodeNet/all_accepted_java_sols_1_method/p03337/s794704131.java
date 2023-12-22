import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int add = A + B;
		int max = add;
		if(max < A - B) {
			max = A - B;
		}
		if(max < A * B) {
			max = A * B;
		}
		System.out.println(max);
	}
}