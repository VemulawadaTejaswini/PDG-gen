import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		sc.close();

		int odd = 0;
		int even = 0;
		if(K % 2 == 0) {
			odd = even = K / 2;
		}else {
			odd = K / 2 + 1;
			even = K / 2;
		}
		System.out.println(odd * even);
	}
}