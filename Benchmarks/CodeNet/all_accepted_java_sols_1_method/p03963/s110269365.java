import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		
		double re = Math.pow(K-1,N-1);
		
		int ans = (int)re;
		
		System.out.println(ans * K);
	}
}
