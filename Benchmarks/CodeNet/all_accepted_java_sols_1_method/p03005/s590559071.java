import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		if(k != 1) {
			System.out.println(n - k);
		}
		else {
			System.out.println(0);
		}		
	}
}