import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static long gcd(long a, long b){
		if(a < b){
			long tmp = a;
			a = b;
			b = tmp;
		}
		while(b!=0){
			long r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			long[] b = new long[n*(n+1)/2];
			Queue<Long> list = new LinkedList<Long>();
			for(int i=0;i<b.length;i++){
				b[i]=sc.nextLong();
				if(b[i]%2==0)list.add(b[i]);
			}
			long gcd = gcd(list.poll(), list.poll());
			while(!list.isEmpty())gcd=gcd(gcd, list.poll());
			PriorityQueue<Long> q = new PriorityQueue<Long>();
			for(int i=0;i<b.length;i++){
				if(b[i]%2==0){
					q.add(b[i]/gcd);
				}
			}
			System.out.println(gcd);
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