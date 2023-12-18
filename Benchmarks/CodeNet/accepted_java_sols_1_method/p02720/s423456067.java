import java.util.*;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		long num = 0;
		
		Deque<Long> lunlun = new ArrayDeque<Long>(9);
		
		for(long i = 1; i <=9; i++) {
			lunlun.add(i);
		}
			
		for(long i = 0; i < K; i++) {
			num = lunlun.pollFirst();
			
			if (num%10 != 0) {
				lunlun.add((num*10) + (num%10) - 1);
			}
			
			lunlun.add((num*10) + (num%10));
			
			if (num%10 != 9) {
				lunlun.add((num*10) + (num%10) + 1);
			}
		}
		System.out.println(num);
		
	}
}
