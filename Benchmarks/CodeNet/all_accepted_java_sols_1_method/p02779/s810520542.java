//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> set = new HashSet<>();
		for(int i=0;i<N;i++) {
			set.add(sc.next());
		}
		if(set.size() == N) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
