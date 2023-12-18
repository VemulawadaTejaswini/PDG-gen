// D - Powerful Discount Tickets

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.nextLine();
		PriorityQueue<Long> AQueue = new PriorityQueue(Comparator.reverseOrder());
		for(int i=0;i<N;i++){
			AQueue.add(sc.nextLong());
		}

		
		for(int i=0; i<M;i++){
			long m = AQueue.poll();
			AQueue.add((long)(m/2));
		}

		long sum = 0;
		Iterator<Long> it = AQueue.iterator();
		while(it.hasNext()){
			sum += it.next();
		}
		System.out.println(sum);	
	}
}