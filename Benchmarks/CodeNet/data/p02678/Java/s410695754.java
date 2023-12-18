//package Contest168;

import java.util.*;
import java.io.*;
import java.math.*;


class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input[]=br.readLine().split(" ");
        
        int n=Integer.parseInt(input[0]);
        
        int m=Integer.parseInt(input[1]);
        
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
        	ArrayList<Integer> list=new ArrayList<>();
        	graph.add(i,list);
        }
        
        for(int i=0;i<m;i++)
        {
        	String s[]=br.readLine().split(" ");
        	int u=Integer.parseInt(s[0])-1;
        	int v=Integer.parseInt(s[1])-1;
        	
        	graph.get(u).add(v);
        	graph.get(v).add(u);
        }
        
        Queue<Integer> queue=new LinkedList<>();
        
        int visited[]=new int[n];
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        
        int level=0;
        int curr=1;
        int next=0;
        
        queue.add(0);
        visited[0]=1;
        int ans2[]=new int[n];
        while(queue.size()>0)
        {
        	int pre=queue.poll();
        	ans[pre]=level;
        	curr--;
        	ArrayList<Integer> neigh=graph.get(pre);
        	for(int i=0;i<neigh.size();i++)
        		{
        			int e=neigh.get(i);
        			if(visited[e]==0)
        			{
        				queue.add(e);
        				visited[e]=1;
        				next++;
        				ans2[e]=pre+1;
        			}
        		}
        	
        	if(curr==0)
        	{
        		curr=next;
        		next=0;
        		level++;
        	}
        }
        //System.out.println(Arrays.toString(ans2));
        
        boolean flag=true;
        
        for(int i=1;i<n;i++)
        {
        	if(ans[i]==-1)
        	{
        		flag=false;
        		break;
        	}
        }
        if(flag==false)
        {
        	System.out.println("No");
        }
        else
        {
        	System.out.println("Yes");
        	for(int i=1;i<n;i++)
        	{
        		System.out.println(ans2[i]);
        	}
        }
        

    }
}