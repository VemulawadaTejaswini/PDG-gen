import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();

		long first = scan.nextLong();
		long max = first;
		long min = first;
		for(int i = 1; i < n; i++) {
			long a = scan.nextLong();
			if(max < a) {
				max = a;
			}else if(min > a) {
				min = a;
			}
		}

		System.out.println(max - min);
    }
}
