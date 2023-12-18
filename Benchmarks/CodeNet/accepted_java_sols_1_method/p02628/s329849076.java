import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
		
		for(int i = 0; i < N; i++) {
			Q.add(Integer.valueOf(s.next()));
		}
		
		int ret = 0;
		for(int i = 0; i < K; i++) {
			ret += Q.poll();
		}
		System.out.println(ret);
	}
}