
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = (X-A)%B;
		System.out.println(C);
	}
}
