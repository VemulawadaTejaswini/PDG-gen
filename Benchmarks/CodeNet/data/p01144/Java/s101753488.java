import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			PriorityQueue<Integer> Q=new PriorityQueue<Integer>(Collections.reverseOrder());
			while(sc.hasNext()) {
				int N=sc.nextInt();
				int M=sc.nextInt();
				if(N+M==0)	break;
				int start=0;
				for(int i=0; i<N; i++) {
					int d=sc.nextInt();
					int p=sc.nextInt();
					for(int j=0; j<d; j++) {
						Q.add(p);
					}
					start+=d;
				}
				for(int i=0; i<M; i++) {
					Q.poll();
				}
				int sum=0;
				while(! Q.isEmpty()) {
					sum+=Q.poll();
				}
				System.out.println(sum);
			}


		}
	}
}
