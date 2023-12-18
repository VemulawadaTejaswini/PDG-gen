import java.io.BufferedReader;
import java.io.IOException;


import java.io.PrintWriter;

import java.io.InputStreamReader;
import java.util.*;
public class Main{
static int inf=999999999;
static int n,m,s1,s2,t;
static int[] ex,ey;
static long[]ew;
static long[] d;
static boolean[] vis;  
static Queue<Integer> queue = new LinkedList<Integer>();
static Stack<Integer> stack = new Stack<Integer>();
static void spfa(){
	for(int i=0;i<n;i++){
		vis[i]=true;
		d[i]=inf;
		queue.clear();
	}
	d[t]=0;
	queue.offer(t);
	vis[t]=false;
	while(!queue.isEmpty()){
		int cur=queue.poll();
		//System.out.println(cur+"pos");
		for(int i=0;i<m;i++){
			if(ex[i]==cur)
				if(d[ey[i]]>d[ex[i]]+ew[i]){
					d[ey[i]]=d[ex[i]]+ew[i];
					if(vis[ey[i]])
						queue.offer(ey[i]);}
		if(ey[i]==cur)
			if(d[ex[i]]>d[ey[i]]+ew[i]){
				d[ex[i]]=d[ey[i]]+ew[i];
				if(vis[ex[i]])
					queue.offer(ex[i]);
				}
		}
	}
}
public static void main(String args[]) throws IOException{ 
    Scanner a = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    while(a.hasNext()){
    	n=a.nextInt();
    	m=a.nextInt();
    	s1=a.nextInt()-1;
    	s2=a.nextInt()-1;
    	t=a.nextInt()-1;
    	if(n==0 &&m==0 && s1==-1 && s2==-1 && t==-1)
    		break;
    	ex=new int[m];
    	ey=new int[m];
    	ew=new long[m];
    	d=new long[n];
    	vis=new boolean[n];
    	stack.clear();
    	for(int i=0;i<m;i++){
    		ex[i]=a.nextInt()-1;
    		ey[i]=a.nextInt()-1;
    		String s=a.next();
    		if(s.equals("x")){ew[i]=0;stack.add(i);}
    		else ew[i]=Integer.parseInt(s);
    	}
    	long x,y,pre,value;
    	spfa();
    	x=d[s1];
    	y=d[s2];
    	value=0;
    	pre=Math.abs(x-y);
    	if(stack.isEmpty()){
    		System.out.println(pre);
    		continue;
    	}
    	if(x==y){
    		System.out.println(0);
    		continue;
    	}
    	value=1;
    	long left,right;
    	
    	while(true){
    	int index=0;
    	value*=2;
    	left=Math.abs(d[s1]-d[s2]);
    	pre=left;
    	//System.out.println(value+" 1 "+left);
    	for(int i=0;i<stack.size();i++){
    		index=stack.get(i);
    		if(ew[index]==0)ew[index]=1;
    		else ew[index]=value;
    	}
    	spfa();
    	x=d[s1];
    	y=d[s2];
    	right=Math.abs(x-y);
    	if(x-y==pre)break;
    	if((x-y)*pre<=0){break;}
    	}
    	long l=value/2,r=value,mid;
    	
    	while(l!=r){
    		mid=(l+r)/2;
    		int index;
    		for(int i=0;i<stack.size();i++){
        		index=stack.get(i);
        		ew[index]=mid;
        	}
    		spfa();
    		pre=Math.abs(d[s1]-d[s2]);
    		if(pre==0){left=pre;break;}
    		if(pre*left>0)l=mid+1;
    		else r=mid;
    		//System.out.println(l+" "+r);
    	}
    	System.out.println(left);
    }
   }
}