import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int P = Integer.parseInt(sc.next());
		
		int ans = (A*3+P)/2;

		System.out.println(ans);

	}
}