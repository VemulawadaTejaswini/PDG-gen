import java.util.*;

public class Main {
	public static void main( String args[] ) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Integer> n_num = new HashSet<Integer>();
		for(int i=0; i<n; i++) {
			n_num.add(in.nextInt());
		}
		int q = in.nextInt();
		int[] q_num = new int[q];
		for(int i=0; i<q; i++) {
			q_num[i] = in.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<q; i++) {
			if(n_num.contains(q_num[i])) count++;
		}
		System.out.println(count);
	}
}