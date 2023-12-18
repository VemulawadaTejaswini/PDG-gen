import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int nums = inputs.nextInt();
		//stores value -> num of items
		HashMap<Long,Integer> vals = new HashMap<>();
		long sum = 0;
		for(int i=0;i<nums;i++) {
			long tem = inputs.nextLong();
			if(!vals.containsKey(tem)) {
				vals.put(tem, 0);
			}
			vals.put(tem, vals.get(tem)+1);
			sum+=tem;
		}
		long Q = inputs.nextLong();
		for(long i=0;i<Q;i++) {
			long C = inputs.nextLong();
			long A = inputs.nextLong();
			if(!vals.containsKey(C)) {
				System.out.println(sum);
				continue;
			}
			sum+=(A-C)*vals.get(C);
			if(!vals.containsKey(A)) {
				vals.put(A, 0);
			}
			vals.put(A, vals.get(A)+vals.get(C));
			vals.remove(C);
			
			System.out.println(sum);
		}
	}

}
