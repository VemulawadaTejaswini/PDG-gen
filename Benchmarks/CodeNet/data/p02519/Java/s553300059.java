import java.util.Scanner;

public class Main{

	int pos;
	int[] d;
	int n, k, t, l, u, v, car, next;
	boolean[] run;

	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		t = sc.nextInt();
		u = sc.nextInt();
		v = sc.nextInt();
		l = sc.nextInt();
		car = 0;
		d = new int[n];
		run = new boolean[l];
		for(int i=0;i<n;i++)d[i]=sc.nextInt();
		next = 0;
		pos = 0;
		while(pos<l){
			if(car>0){
				if(run[pos]){
					if(next<n&&pos==d[next]){
						if(car==k){
							int from = pos;
							int to = pos + t*v;
							while(from<l&&from<to)run[from++]=true;
						}
						else{
							car++;
						}
						next++;
					}
				}
				else{
					car--;
					int from = pos;
					int to = pos + t*v;
					while(from<l&&from<to)run[from++]=true;
				}
			}
			else{
				if(next<n&&pos==d[next]){
					next++;
					if(run[pos]){
						car = Math.min(car+1, k);
					}
					else{
						int from = pos;
						int to = pos + t*v;
						while(from<l&&from<to)run[from++]=true;
					}
				}
			}
			pos++;
		}
		int r = 0, a = 0;
		for(int i=0;i<l;i++){
			if(run[i])r++;
			else a++;
		}
		System.out.println(r*1.0/v+a*1.0/u);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}