import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		System.out.println((X >= A)?10:0);
	}
}