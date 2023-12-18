import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

// The Incubator
// 2012/12/04
public class Main{
	Scanner sc=new Scanner(System.in);

	void run(){
		for(;;){
			int q=sc.nextInt();
			int lim=sc.nextInt();
			if((q|lim)==0){
				return;
			}

			BIT bit=new BIT(q);
			HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
			int[] a=new int[q];

			for(int i=0; i<q; i++){
				int query=sc.nextInt();
				int x=sc.nextInt();
				if(query==0){
					map.put(x, i);
					bit.add(i, 1);
					a[i]=x;
					if(bit.sum(0, q)>lim){
						int k=bit.get(0);
						bit.add(k, -1);
					}
				}else if(query==1){
					int k=bit.get(x-1);
					bit.add(k, -1);
				}else if(query==2){
					int k=bit.get(x-1);
					println(a[k]+"");
				}else if(query==3){
					int k=map.get(x);
					bit.add(k, -1);
				}
			}
			println("end");
		}
	}

	class BIT{
		int[] vs;

		BIT(int n){
			vs=new int[n+1];
		}

		void add(int k, int a){
			for(int i=k+1; i<vs.length; i+=i&-i){
				vs[i]+=a;
			}
		}

		int sum(int s, int t){
			if(s>0)
				return sum(0, t)-sum(0, s);
			int res=0;
			for(int i=t; i>0; i-=i&-i){
				res+=vs[i];
			}
			return res;
		}

		int get(int k){
			int p=Integer.highestOneBit(vs.length-1);
			for(int q=p; q>0; q>>=1, p|=q){
				if(p>=vs.length||k<vs[p])
					p^=q;
				else
					k-=vs[p];
			}
			return p;
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}