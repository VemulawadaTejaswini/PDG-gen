import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N100 = N / 100;
		int N1 = N % 10;
		int N10 =( N - (N100 * 100 + N1) )/ 10;
		System.out.println(N100 == 7 || N10 == 7 || N1 == 7 ? "Yes" : "No");
	}

}