import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] data = new int[n + 1];
			for(int i = 1; i <= n; i++){
				data[i] = sc.nextInt();
			}
			int m = 256;
			double ans = 1 << 24;
			int as=0, aa=0, ac=0;
			for(int s = 0; s <= 15; s++){
				for(int a = 0; a <= 15; a++){
					for(int c = 0; c <= 15; c++){
						int [] r = new int[n + 1];
						r[0] = s;
						for(int i = 1; i <= n; i++){
							r[i] = (a * r[i-1] + c) % m;
						}
						int [] freq = new int[m];
						for(int i = 1; i <= n; i++){
							freq[(r[i] + data[i]) % m]++;
						}
						double nowh = 0;
						for(int i = 0; i < m; i++){
							if(freq[i] == 0) continue;
							double value= ((double)freq[i] / n) * Math.log((double)freq[i] / n);
							nowh -= value;
						}
						if(ans > nowh){
							ans = nowh;
							as = s;
							aa = a;
							ac = c;
						}
					}
				}
			}
			System.out.println(as + " " + aa + " " + ac);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}