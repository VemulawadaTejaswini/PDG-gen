import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			long[] b = new long[n*(n+1)/2];
			for(int i=0;i<b.length;i++){
				b[i]=sc.nextLong();
			}
			long g = (long)Math.sqrt(b[0]*b[1]/b[n]);
			System.out.println(g);
			Queue<Long> q = new PriorityQueue<Long>();
			for(int i=0;i<b.length;i++){
				if(b[i]%2==0)q.add(b[i]/g);
			}
			boolean f = true;
			while(!q.isEmpty()){
				if(!f)System.out.print(" ");
				f = false;
				System.out.print(q.poll());
			}
			System.out.println();
		}
	}
}