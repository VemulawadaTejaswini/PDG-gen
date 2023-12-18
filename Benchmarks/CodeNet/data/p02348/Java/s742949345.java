

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	static int n = 1;
	static int[] D;
	static int[] M;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n_num = sc.nextInt();
		int op_num = sc.nextInt();
		init(n_num,op_num);
		
		int i = 0;
		StreamTokenizer in = new StreamTokenizer(new BufferedReader (
				new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int mark =0;
		while(in.nextToken() != StreamTokenizer.TT_EOF && i <=op_num) {
			int token = (int)in.nval;
			in.nextToken();
			if(token ==0) {
				int x = (int)in.nval;
				in.nextToken();
				int y = (int)in.nval;
				in.nextToken();
				int z = (int)in.nval;
				//System.out.println(x+y+z);
				arr[i]= z;
				update(x,y+1,0,0,n,mark);
			}else {
				int k = (int)in.nval;
				//System.out.println(k);
				int result = find(k+n-1,n,M,arr);
				out.println(result);
				out.flush();
			}
			i++;
			mark++;
		}
		
		
	}
	private static int find(int n1, int n2, int[] m2, int[] arr2) {
		// TODO Auto-generated method stub
		int max = n1;
		for(int i=0;n1>0;i++) {
			n1 = (n1 - 1)/2;
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
	private static void update(int a, int b, int k, int l, int r, int mark) {
		// TODO Auto-generated method stub
		if(r<=a || b<=l)
			return;
		if(a<=l && r<=b) {
			M[k] = mark;
			return;
		}
		update(a,b,2*k+1,l,(l+r)/2,mark);
		update(a,b,k*2+2,(l+r)/2,r,mark);
	}
	public static void init(int N,int op) {
		n = 1;
		while(n<N)
			n*=2;
		D = new int[n*2 - 1];
		M = new int[n*2 - 1];
		arr = new int[op];
		for(int i=0;i<2*n-1;i++)
		{
			D[i] = INF;
			M[i] = -1;
		}
	}
}

