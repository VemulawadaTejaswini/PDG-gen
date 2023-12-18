import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long[] leaf = new long[N + 1];
		for(int i = 0; i < N + 1; i++) {
			leaf[i] = s.nextInt();
		}
		long[] MAX = new long[N+2];
		long[] MIN = new long[N+2];
		MAX[N] = MIN[N] = leaf[N];
		
		for(int i = N - 1; i >= 0; i--) {
			MAX[i] = MAX[i+1] + leaf[i];
			MIN[i] = (MIN[i+1]+1) / 2 + leaf[i]; 
		}
		
		if(MIN[0] != 1) {
			System.out.println("-1");
			return;
		}
		
		long cur = 1;
		long ret = 0;
		for(int i = 0; i <= N; i++) {
			ret += cur;
			cur -= leaf[i];
			cur = Long.min(cur*2, MAX[i+1]);
		}
		System.out.println(ret);
	}
}