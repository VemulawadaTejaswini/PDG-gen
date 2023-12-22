import java.util.*;

public class Main{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong() + sc.nextLong();
		sc.close();
		System.out.println((x % 2 == 0)?x / 2:"IMPOSSIBLE");
	}
}