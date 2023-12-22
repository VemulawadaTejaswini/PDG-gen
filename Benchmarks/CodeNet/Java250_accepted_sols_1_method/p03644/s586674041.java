
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(; n > 0; n--) {
			if((n & (n-1)) == 0) {
				System.out.println(n);
				break;
			}
		}
	}

}
