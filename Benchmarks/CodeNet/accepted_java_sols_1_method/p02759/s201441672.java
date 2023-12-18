import java.util.Scanner;

//AtCoder Beginner Contest 157
//A	Duplex Printing
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		if (N%2==0) {
			System.out.println(N/2);
		} else {
			System.out.println((N/2)+1);
		}

	}
}
