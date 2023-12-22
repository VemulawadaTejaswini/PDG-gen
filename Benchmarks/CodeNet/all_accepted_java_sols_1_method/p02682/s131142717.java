import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int ssa = Math.min(a, k);
		int ssc = Math.max(0, Math.min(k-a-b, c));

		System.out.println(ssa-ssc);
	}
}