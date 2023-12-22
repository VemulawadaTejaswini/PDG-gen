import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		sc.close();

		if(H <= A) {
			System.out.println(1);
		}else {
			if(H % A == 0) {
				System.out.println(H / A);
			}else {
				System.out.println(H / A + 1);
			}
		}
	}
}