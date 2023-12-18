

import java.util.Scanner;

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	static int n = 1;
	static int[] D;
	static int[] M;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int op_num = sc.nextInt();
		String[] op = new String[op_num+1];
		for(int i=0;i<op.length;i++)
			op[i]=sc.nextLine();
		
		init(n1);
		arr = new int[op_num];
		
		for(int i=1,mark=0,i1=0;i<=op_num;i++) {
			String[] Split = op[i].split(" ");
			int x,y,z;
			if(Integer.parseInt(Split[0]) == 0) {
				x = Integer.parseInt(Split[1]);
				y = Integer.parseInt(Split[2]);
				z = Integer.parseInt(Split[3]);
				arr[i1] = z;
				update(x,y+1,0,0,n,mark);
			}else {
				x = Integer.parseInt(Split[1]);
				int result = find(x+n-1,n);
				System.out.println(result);
			}
			i1++;
			mark++;
		}
		
		
		/*System.out.println("M[]:");
		for(int i=0;i<M.length;i++)
			System.out.print(M[i]+" ");
		System.out.println(n);
		System.out.println("arr[]:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");*/
		
		
	}

	private static int find(int n1, int n2) {
		// TODO Auto-generated method stub
		int max = n1;
		for(int i=0;n1>0;i++) {
			n1 = (n1-1)/2;
			if(M[max]<M[n1])
				max = n1;
		}
		int temp;
		if(M[max] == -1)
			temp = INF;
		else
			temp = arr[M[max]];
		
		return temp;
	}

	public static void update(int a, int b, int k, int l, int r, int mark) {
		// TODO Auto-generated method stub
		/*if(r<=a||b<=l)
			return;
		if(a<=l && r<=b) {
			M[k] = mark;
			return;
		}*/
		if(r<=a || b<=l)
			return;
		if(a<=l && r<=b) {
			M[k] = mark;
			return;
		}
		update(a,b,2*k+1,l,(l+r)/2,mark);
		update(a,b,2*k+2,(l+r)/2,r,mark);
	}

	public static void init(int N) {
		// TODO Auto-generated method stub
		n = 1;
		while(n<N)
			n*=2;
		D = new int[n*2-1];
		M = new int[n*2-1];
		for(int i=0;i<n*2-1;i++) {
			D[i] = INF;
			M[i] = -1;
		}
	}

}

