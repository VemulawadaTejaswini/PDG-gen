
import java.util.*;
public class Main {
	int INF = 1 << 24;

	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] dis = new int[n];
			int [] v = new int[n];
			for(int i = 0; i < n; i++){
				dis[i] = sc.nextInt();
				v[i] = sc.nextInt();
			}
			long [] data = new long[n];
			data[0] = v[0];
			long m = dis[0];
			for(int i = 1; i < n; i++){
				long g = gcd(dis[i], v[i]);
				long dis1 = dis[i] / g;
				long v1 = v[i] / g;
				long l = lcm(m, dis1);
				for(int j = 0; j < i; j++){
					data[j] = data[j] *  (l / m);
				}
				v1 = v1 * (l / dis1);
				data[i] = v1;
				m = l;
			}
			long gg = data[0];
			for(int i = 1; i < n; i++){
				gg = gcd(gg, data[i]);
			}
			for(int i = 0; i < n-1; i++){
				System.out.println(data[i] / gg);
			}
			System.out.println(data[n-1] / gg);
		}
	}


	private long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}


	private long gcd(long a, long b) {
		if(b == 0){
			return a;
		}
		else{
			return gcd(b, a % b);
		}
	}


	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}