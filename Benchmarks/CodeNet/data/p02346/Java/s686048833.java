import java.util.*;

class Main{
	
	public static class RSQ{
		int[] data;
		
		public RSQ(int n){
			data = new int[n+1];
		}
		
		public void add(int k, int a){
			for (int i = k+1; i < data.length; i += i & -i) {
				data[i] += a;
			}
		}
		
		public int sum(int s, int t){
			if (s>0) {
				return sum(0,t)-sum(0,s);
			}
			int comp = 0;
			for (int i = t; i > 0; i -= i & -i) {
				comp += data[i];
			}
			return comp;
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		RSQ rsq = new RSQ(n);
		for (int i = 0; i < q; i++) {
			int op = sc.nextInt();
			int x = sc.nextInt()-1;
			int y = sc.nextInt();
			
			if(op==0){
				rsq.add(x, y);
			}else {
				System.out.println(rsq.sum(x, y));
			}
		}
	}
	
	
}
