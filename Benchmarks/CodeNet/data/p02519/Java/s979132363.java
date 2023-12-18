import java.util.Scanner;

public class Main{

	double pos, time;
	int[] d;
	int n, k, t, u, v, l, car, next;

	void nextPos(double rest){
//		System.out.println("POs:" + pos + " rest:" + rest + " car:" + car);
		if(rest==0){
			if(next<n){
				double np = d[next++];
				time += (np-pos)/u;
				pos = np;
				car = Math.min(car+1, k);
			}
			else{
				time += (l-pos)/u;
				pos = l;
			}
		}
		else{
			double np = Math.min(l, pos+rest*v);
			if(next<n){
				if(np<d[next]){
					time += (np-pos)/u;
					pos = np;
				}
				else{
					np = d[next++];
					double dt = (np-pos)/v;
					time += dt;
					pos = np;
					if(car==k)nextPos(t);
					else {
						car = Math.min(car+1, k);
						nextPos(rest-dt);
					}
				}
			}
			else{
				time += (np-pos)/v;
				pos = np;
			}
		}
	}

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
		for(int i=0;i<n;i++)d[i]=sc.nextInt();
		next = 0;
		pos = 0;
		time = 0;
		while(pos<l){
//			System.out.println("POS:" + pos + " CAr:" + car);
			if(car>0){
				car--;
				nextPos(t);
			}
			else{
				nextPos(0);
			}
		}
		System.out.println(time);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}