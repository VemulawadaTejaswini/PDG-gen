import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long h = scanner.nextLong();
		long w = scanner.nextLong();
		long h_odd = (h + 1) / 2;
		long h_even = h / 2;
		long w_odd = (w + 1) / 2;
		long w_even = w / 2;
		
		if(h==1||w==1) {
			System.out.println(1);
			return;
		}
		
		System.out.println(h_odd * w_odd + h_even * w_even);

	}

}
