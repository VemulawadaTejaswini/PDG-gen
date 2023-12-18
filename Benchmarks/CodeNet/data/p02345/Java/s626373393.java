import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int Q=sc.nextInt();

		int[] A=new int[N];
		Arrays.fill(A,Integer.MAX_VALUE);

		SegmentTree seg=new SegmentTree(A);

		int min=0;
		for (int i = 0; i < Q; i++) {

			int query=sc.nextInt();
			int X=sc.nextInt();
			int Y=sc.nextInt();

			if(query==0) {
				seg.updata(X, Y);
			}else {
				min=seg.getmin(X,Y+1,0,0,-1);
				System.out.println(min);
			}

		}
	}
}




class SegmentTree {
	private int N;
	private int[] node;
	private static int INF=Integer.MAX_VALUE;

	SegmentTree(int[] v){

		int size=v.length;

		N=1;

		//NはNを超えるなかで最小の2のべき乗。
		while(N<size) {
			N*=2;
		}

		node=new int[2*N-1];

		Arrays.fill(node,INF);

		for (int i = 0; i < size; i++) {
			node[i+N-1]=v[i];
		}

		for (int i = N-2; i >= 0; i--) {
			node[i]=Math.min(node[2*i+1],node[2*i+2]);
		}

	}

	void updata(int index,int val) {
		//元の配列の要素番号から、セグ木の葉に変換する。
		index+=(N-1);

		//まず葉を更新。
		node[index]=val;

		//そこから順番に親をたどりながら更新していく
		while(index>0) {
			index=(index-1)/2;
			node[index]=Math.min(node[2*index+1],node[2*index+2]);
		}
	}

	int getmin(int a,int b,int k,int l,int r) {

		if(r<0) {r=N;};

		if(r<=a || b<=l) {
			return INF;
		}

		if(a<=l && r<=b) {
			return node[k];
		}

		int vl=getmin(a,b,2*k+1,l,(l+r)/2);
		int vr=getmin(a,b,2*k+2,(l+r)/2,r);

		return Math.min(vl,vr);
	}
}

