import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Double> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++){
			pq.add(sc.nextDouble());
		}
		//System.out.println(pq.poll());
		//double sum = 0;
		double a,b,x;
		while(pq.size() != 1){
			a = pq.poll();
			b = pq.poll();
			x = (a + b) / 2;
			pq.add(x);
	}
		double ans = pq.peek();
	System.out.println(ans);
	}
	
	
	}