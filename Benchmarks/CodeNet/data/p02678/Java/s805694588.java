import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	static int min=0;
	static void dfs(int index, boolean visited[], ArrayList<ArrayList<Integer>> list, int len)
	{
		if(index==0)
		{
			min=Math.min(min, len);
			return;
		}
		visited[index]=true;
		for(int i=0; i<list.get(index).size(); i++) {
			int num = list.get(index).get(i);
			if(visited[num]==false)
			{
				dfs(num,visited,list,len+1);
			}
		}
		visited[index]=false;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<N; i++)
		{
			list.add(new ArrayList<Integer>());
		}
		for(int i=0; i<M; i++)
		{
			int first = scan.nextInt()-1;
			int second = scan.nextInt()-1;
			list.get(first).add(second);
			list.get(second).add(first);
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean possible=true;
		for(int i=1; i<N; i++)
		{
			min=Integer.MAX_VALUE;
			boolean visited[] = new boolean[N];
			dfs(i,visited,list,0);
			if(min==Integer.MAX_VALUE) { possible=false; break; }
			result.add(min);
		}
		if(possible)
		{
			System.out.println("Yes");
			for(Integer i: result)
			{
				System.out.println(i);
			}
		}
		else
		{
			System.out.println("No");
		}
	}
}
