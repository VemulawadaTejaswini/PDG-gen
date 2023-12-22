import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.next());
		int ans = (int)Math.pow(x, 3);
		System.out.println(ans);
	}
}	
