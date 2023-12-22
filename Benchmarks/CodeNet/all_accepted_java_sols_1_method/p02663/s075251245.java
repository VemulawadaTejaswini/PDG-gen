import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int L1 = H1 * 60 + M1;
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int L2 = H2 * 60 + M2;
		int K = sc.nextInt();
		L2 -= K;
		int ans = L2 - L1;
		System.out.println(ans);
	}
}