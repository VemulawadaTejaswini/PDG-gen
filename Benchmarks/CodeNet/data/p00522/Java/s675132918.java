import java.io.*;
import java.math.*;
import java.util.*;

class Main{
	public static void main(String...args) throws IOException{
		Scanner r = new Scanner(System.in);
		int M,N;
		M=Integer.parseInt(r.next());
		N=Integer.parseInt(r.next());
		int[] man = new int[M];
		int[] kazu = new int[N];
		int[] hako = new int[N];
		int[] value = new int[N];
		int tmp,index;
		int manin,hakoin;
		int total;
		for(int i=0;i<M;i++){
			man[i]=Integer.parseInt(r.next());
		}
		for(int i=0;i<N;i++){
			kazu[i]=Integer.parseInt(r.next());
			hako[i]=Integer.parseInt(r.next());
			value[i]=hako[i]/kazu[i];
		}
		Arrays.sort(man);
		for(int i=0;i<N-1;i++){
			tmp=value[i];
			index=i;
			for(int j=i+1;j<N;j++){
				if(tmp>value[j]){
					tmp=value[j];
					index=j;
				}
			}
			value[index]=value[i];
			value[i]=tmp;
			tmp=kazu[index];
			kazu[index]=kazu[i];
			kazu[i]=tmp;
			tmp=hako[index];
			hako[index]=hako[i];
			hako[i]=tmp;
		}
		int flag=0;
		int ans;
		total=0;
		hakoin=total=0;
		manin=M-1;
		int h,t,k;
		while(true){
			if(hakoin == N || manin<0) break;
			h=hakoin;
			if(man[manin]>value[h]){
				t=0;
				index=0;
				while(man[manin]>value[h]){
					ans=0;
					for(int i=0;i<kazu[h];i++){
						if(-i+manin == -1){
							flag=1;
							break;
						}
						ans+=man[-i+manin];
					}
					if(t<ans-hako[h]){
						index=h;
						t=ans-hako[h];
					}
					h++;
				}
				if(t>0){
					total+=t;
					manin-=kazu[index];
					for(int j=index;j>0;j--){
						hako[j]=hako[j-1];
						kazu[j]=kazu[j-1];
						value[j]=value[j-1];
					}
					hakoin++;
				}
				else flag=1;
			}
			else break;
			if(flag==1)break;
		}
		System.out.println(total);
	}
}