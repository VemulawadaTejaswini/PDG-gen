
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String i1[]=br.readLine().split(" ");
		int V=Integer.parseInt(i1[0]);
		int E=Integer.parseInt(i1[1]);
		String h[]=br.readLine().split(" ");
		int ht[]=new int[V];
		for(int i=0;i<V;i++)
		{
			ht[i]=Integer.parseInt(h[i]);
		}
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		
		for(int i=0;i<V;i++)
		{
			ArrayList<Integer> road=new ArrayList<>();
			graph.add(road);
		}
		
		for(int i=0;i<E;i++)
		{
			String uv[]=br.readLine().split(" ");
			int u=Integer.parseInt(uv[0]);
			int v=Integer.parseInt(uv[1]);
			
			u--;
			v--;
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		//For each from 0 to N;
		int total=0;
		for(int i=0;i<V;i++)
		{
			//here i is our obs;
			ArrayList<Integer> rd=graph.get(i);
			boolean good=true;
			int height=ht[i];
			
			for(Integer r: rd)
			{
				if(ht[r]>=height)
				{
					good=false;
					break;
				}
			}
			if(good)
			{
				total++;
			}
			
		}
		
		System.out.println(total);
		
		
		
	}

}
