import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 int nums = 123;
		for(int i = 0; nums != 0 ; i++) {
			nums = scan.nextInt();
			System.out.println("Case " + i+1 + ": " + nums);
		}
 }
}