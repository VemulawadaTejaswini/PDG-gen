import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		Scanner ob = new Scanner(System.in);
		int N = ob.nextInt();
		int X = ob.nextInt();
		int T = ob.nextInt();
		int result = 0;
		
		while(N > 0) {
			N -= X;
			result += T;
		}
		System.out.println(result);
		ob.close();
	}
}
