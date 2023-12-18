import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {
	
	static PrintWriter out;
	//static Scanner sc;
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//sc=new Scanner(System.in);
		br=new BufferedReader(new InputStreamReader(System.in));
		out=new PrintWriter(System.out);
		
		String s[]=br.readLine().split(" ");
		int n=Integer.valueOf(s[0]);
		int q=Integer.valueOf(s[1]);
		a=new int[n];
		s=br.readLine().split(" ");
		for(int i=0;i<n;i++)a[i]=Integer.valueOf(s[i]);
		tree=new TreeSet[4*n];
		build(0,0,n-1);
		while(q-->0) {
			s=br.readLine().split(" ");
			int l=Integer.valueOf(s[0])-1;
			int r=Integer.valueOf(s[1])-1;
			out.println(query(0,0,n-1,l,r).size());
		}
		//sc.close();
		br.close();
		out.close();
		
	}
	static TreeSet<Integer> tree[];
	static int a[];
	static void build(int cur,int l,int r) {
		if(l==r) {
			tree[cur]=new TreeSet<>();
			tree[cur].add(a[l]);
			return;
		}
		int mid=(l+(r-l)/2);
		build(2*cur+1,l,mid);
		build(2*cur+2,mid+1,r);
		tree[cur]=merge(tree[2*cur+1],tree[2*cur+2]);
	}
	static TreeSet<Integer> merge(TreeSet<Integer> o1,TreeSet<Integer> o2){
		TreeSet<Integer> ts=new TreeSet<>();
		for(int x:o1) {
			ts.add(x);
		}
		for(int x:o2) {
			ts.add(x);
		}
		return ts;
	}
	static TreeSet<Integer> query(int cur,int l,int r,int start,int end) {
		if(r<start || l>end)return new TreeSet<>();
		if(l>=start && r<=end)return tree[cur];
		int mid=(l+r)>>1;
		TreeSet<Integer> p1=query(2*cur+1,l,mid,start,end);
		TreeSet<Integer> p2=query(2*cur+2,mid+1,r,start,end);
		return merge(p1,p2);
	}
}
