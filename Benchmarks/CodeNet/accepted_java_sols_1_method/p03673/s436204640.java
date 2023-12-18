import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * https://abc066.contest.atcoder.jp/tasks/arc077_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i=0; i<N; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		
		List<Integer> b = new LinkedList<>();
		
		for(int i=0; i<N; i++){
			if(i%2==0){
				b.add(a[i]);
			}else{
				b.add(0,a[i]);
			}
		}
		
		if(N%2==1)
			Collections.reverse(b);

		StringBuilder sb = new StringBuilder();
		int i=0;
		for(int n:b){
			sb.append(n);
			if(++i!=N) sb.append(" ");
		}		
		System.out.println(sb.toString());
			
	}

}