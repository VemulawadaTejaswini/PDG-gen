import java.util.PriorityQueue;
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
			for(int i=0;i<b.length;i++)b[i]=sc.nextLong();
			long gcd = gcd(b[0], b[1]);
			for(int i=2;i<n;i++)gcd = gcd(gcd, b[i]);
			PriorityQueue<Long> q = new PriorityQueue<Long>();
			for(int i=0;i<n;i++)q.add(b[i]/gcd);
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