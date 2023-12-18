import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Triangle of Blocks
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		boolean[] tri = new boolean[1000001];
		for(int i=1;i*(i+1)>>1<=1000000;i++){
			tri[i*(i+1)>>1] = true;
		}
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			Queue<Integer> q = new LinkedList<Integer>();
			int expect = 1;
			boolean f = true;
			int sum = 0;
			for(int i=0;i<n;i++){
				int x = sc.nextInt();
				sum+=x;
				f&=x==expect++;
				q.add(x);
			}
			if(!tri[sum]){
				System.out.println(-1);
				continue;
			}
			int res = 0;
			while(res <= 10000){
				if(f){
					System.out.println(res); break;
				}
				res++;
				f = true;
				expect = 1;
				Queue<Integer> next = new LinkedList<Integer>();
				int size = q.size();
				while(!q.isEmpty()){
					int x = q.poll();
					if(1 < x){
						f&=--x==expect++;
						next.add(x);
					}
				}
				f&=size==expect;
				next.add(size);
				q = next;
			}
			if(res==10001)System.out.println(-1);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}