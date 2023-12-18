

import java.util.Scanner;

public class Main {
	public static final int INF=Integer.MAX_VALUE;
	static int size =1;
	static int[] val;
	static int[] lazy;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,q;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		
		
		while (size <n)
			size*=2;
		val = new int[size*2-1];
		lazy = new int[size*2 - 1];
		
		for(int i = 0;i<size*2-1;i++) {
			val[i] = INF;
			lazy[i] = -1;
		}
		
		String[] op = new String[q+1];
		for(int i=0;i<op.length;i++)
			op[i] = sc.nextLine();
		for(int i=1;i<=q;i++) {
			String[] Split = op[i].split(" ");
			int x,y,z;
			if(Integer.parseInt(Split[0]) == 0) {
				x = Integer.parseInt(Split[1]);
				y = Integer.parseInt(Split[2]);
				z = Integer.parseInt(Split[3]);
				Update(x,y+1,z);
			}else {
				x = Integer.parseInt(Split[1]);
				y = Integer.parseInt(Split[2]);
				int result = GetMin(x,y+1);
				System.out.println(result);
			}
			
		}
		
	}
	
	public static void lazy_propagate(int p) {
		if(lazy[p] !=-1) {
			val[p] = lazy[p];
			if(p< (size-1)) {
				lazy[p*2+1] = lazy[p];
				lazy[p*2+2] = lazy[p];
			}
			lazy[p] = -1;
		}
	}
	public static void update(int wishl,int wishr,int watchl,int watchr,int k,int x) {
		if(wishr <= watchl || watchr <= wishl) {
			lazy_propagate(k);
			return;
		}
		if(wishl <= watchl && watchr <= wishr) {
			lazy[k] = x;
			lazy_propagate(k);
			return;
		}
		int mid = (watchl+watchr)/2;
		lazy_propagate(k);
		update(wishl,wishr,watchl,mid,k*2+1,x);
		update(wishl,wishr,mid,watchr,k*2+2,x);
		val[k] = Math.min(val[k*2+1], val[k*2+2]);
	}
	public static void Update(int wishl,int wishr,int x) {
		update(wishl,wishr,0,size,0,x);
	}
	public static int getMin(int wishl,int wishr,int watchl,int watchr,int k ) {
		if(wishr <= watchl || watchr <= wishl) {
			return INF;
		}
		if(wishl <= watchl && watchr<=wishr) {
			lazy_propagate(k);
			return val[k];
		}
		int mid = (watchl+watchr)/2;
		lazy_propagate(k);
		int ml = getMin(wishl,wishr,watchl,mid,k*2+1);
		int mr = getMin(wishl,wishr,mid,watchr,k*2+2);
		return Math.min(ml, mr);
	}
	public static int GetMin(int wishl,int wishr) {
		return getMin(wishl,wishr,0,size,0);
	}
	
}

