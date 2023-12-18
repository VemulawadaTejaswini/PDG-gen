import java.util.*;
class MyComp implements Comparator<Long> {

	public int compare(Long o1, Long o2) {
		if(o1 < o2) {
			return 1; 
		}
		else if(o1 > o2) {
			return -1;
		}
		return 0;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Comparator<Long> c = new MyComp();
		PriorityQueue <Long> queJ= new PriorityQueue <Long> (11,c);
		while (true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			queJ.clear();
			Long sum = 0L;
			for(int i = 0; i < n; i++) {
				sum += stdIn.nextLong();
			}
			for(int i = 0; i < n-1; i++) {
				queJ.add(stdIn.nextLong());
			}
			Long max = 0L;
			for(int i = 0; i < n-1; i++) {
				System.out.println(sum *(n-i));
				if(max < sum *(n-i)) {
					max = sum * (n-i);
				}
				sum += queJ.poll();
			}
			System.out.println(max);
			
			
		}
	}
}