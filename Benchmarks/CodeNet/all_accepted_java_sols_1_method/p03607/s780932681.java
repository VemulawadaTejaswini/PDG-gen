import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://beta.atcoder.jp/contests/abc073/tasks/abc073_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		Set<Long> dp = new HashSet<Long>();
		for(int i=0; i<N; i++){
			long a = sc.nextLong();
			if(dp.contains(a)){
				dp.remove(a);
			}else{
				dp.add(a);
			}
		}
		sc.close();

		System.out.println(dp.size());
		
	}

}