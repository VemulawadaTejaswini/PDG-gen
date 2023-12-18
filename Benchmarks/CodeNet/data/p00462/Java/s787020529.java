
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		while(in.hasNext())new AOJ0539().doIt();
	}
	
	class AOJ0539{
		long d,n,m;
		ArrayList<Long> list;
		void doIt(){
			d = in.nextLong();
			if(d==0)return;
			n = in.nextLong();
			m = in.nextLong();
			list = new ArrayList<Long>();
			list.add(0L);
			for(int i=0;i<n-1;i++)list.add(in.nextLong());
			list.add(d);
			Collections.sort(list);
//			System.out.println(list);
			long result = 0;
			for(int i=0;i<m;i++){
				long b = (in.nextLong());
//				System.out.println(b);
				int q = Collections.binarySearch(list, b);
				if(q<0)q = ~q;
//				System.out.println(q);
				long min = Math.min(Math.abs(list.get(q)-b), Math.abs(list.get(q-1)-b));
				result += min;
//				System.out.println();
			}
			System.out.println(result);
		}
	}
	
}