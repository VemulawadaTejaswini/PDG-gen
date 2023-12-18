import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main{
	static class Data{
		int t1,t2;
		Data(int T1,int T2){ t1=T1; t2=T2; }
	};

	static class Cmp implements Comparator<Data>{
		public int compare(Data d1,Data d2){
			if(d1.t1!=d2.t1) return d1.t1-d2.t1;
			return d1.t2-d2.t2;
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0) break;

			List<Data>[] A=new ArrayList[m];
			for(int i=0;i<m;i++) A[i]=new ArrayList();

			int r=sc.nextInt();
			{
				int[] last=new int[n];
				for(int i=0;i<r;i++){
					int t=sc.nextInt();
					int a=sc.nextInt()-1;
					int b=sc.nextInt()-1;
					int s=sc.nextInt();
					if(s==1) last[a]=t;
					else     A[b].add(new Data(last[a],t));
				}
			}

			for(int i=0;i<m;i++) Collections.sort(A[i],new Cmp());

			int q=sc.nextInt();
			for(int i=0;i<q;i++){
				int t1=sc.nextInt();
				int t2=sc.nextInt();
				int b=sc.nextInt()-1;

				int ans=0,last=t1;
				for(Data D:A[b]){
					last=Math.max(last,D.t1);
					ans+=Math.max(Math.min(D.t2,t2)-last,0);
					last=Math.max(last,D.t2);
				}
				System.out.println(ans);
			}
		}

		return;
	}
}