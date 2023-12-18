import java.util.Scanner;

public class Main {
	
	static int n;
	static int k;
	static int[] w;
	
	static boolean judge(int m) {
		int count = 1;
		int s = 0;
		for(int i=0;i<n;i++) {
			if(s+w[i] <= m) {
				s += w[i];
			}else {
				s = w[i];
				count++;
			}
		}
		if(count <= k) {
			return true;
		}else {
			return false;
		}
	}
	
	void main() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		w = new int[n];
		int sum = 0;
		int max = 1;
		for(int i=0;i<n;i++) {
			w[i] = sc.nextInt();
			sum += w[i];
			max = Math.max(max, w[i]);
		}
		int l = Math.max(sum/n,max)-1;
		int h = 1000000000;
		while(l+1 < h) {
			int m = (l+h)/2;
			if(judge(m)) {
				h = m;
			}else {
				l = m;
			}
		}
		System.out.println(h);
	}
		
	public static void main(String[] args) {
		new Main().main();
	}
	
}
