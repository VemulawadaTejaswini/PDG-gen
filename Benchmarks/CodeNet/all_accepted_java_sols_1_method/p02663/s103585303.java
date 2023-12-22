import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		
		int start = H1 * 60 + M1;
		int end = H2 * 60 + M2;
		int temp = Math.min(start, end);
		end = Math.max(start, end);
		start = temp;
		
		System.out.println(end - start - K);
		
		sc.close();
	}
}