import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int count = 0;
		while(n > 0) {
			n /= k;
			count++;
		}
		System.out.println(count);
	}

}
