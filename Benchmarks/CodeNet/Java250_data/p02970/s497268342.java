import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		sc.close();

		int m = 2 * D + 1;
		System.out.println((int)Math.ceil((double)N / m));
	}
}
