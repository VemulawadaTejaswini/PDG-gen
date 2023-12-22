import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		System.out.println((int) Math.ceil((B - 1.0) / (A - 1.0)));
	}
}
