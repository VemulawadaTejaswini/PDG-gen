import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		disjointSet dsu=new disjointSet();
		
		for(int i=1;i<=n;i++)
		{
			dsu.makeset(i);
		}
		
		for(int i=0;i<m;i++)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			
			dsu.union(a,b);
		}
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=1;i<=n;i++)
		{
			int p=dsu.findParentValue(i);
			
			if(map.containsKey(p))
			{
				map.put(p,map.get(p)+1);
			}
			else
			{
				map.put(p, 1);
			}
		}
		
		int max=0;
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			max=Math.max(max,entry.getValue());
		}
		
		System.out.println(max);
		
	}
	
}

class disjointSet {
	
	// We could use an ArrayList but that is space consuming to FIND a node
	// HashMap is more convenient
	
	private HashMap<Integer,Node> map=new HashMap<>();
	
	public class Node
	{
		int data;
		int rank;
		Node parent;
	}
	
	public void makeset(int data)
	{
		Node node=new Node();
		
		node.data=data;
		node.rank=0;
		node.parent=node;
		
		map.put(data, node);
		
	}
	
	public void union(int data1,int data2)
	{
		Node node1=map.get(data1);
		Node node2=map.get(data2);
		
		Node parent1=findParentNode(node1);
		Node parent2=findParentNode(node2);
		
		if(parent1.data==parent2.data)
			return;
		
		if(parent1.rank>=parent2.rank)
		{
			parent1.rank=(parent1.rank==parent2.rank) ? parent1.rank=parent1.rank+1 : parent1.rank;
			parent2.parent=parent1;
		}
		else
		{
			parent1.parent=parent2;
		}
	}

	public Node findParentNode(Node node)
	{
		
		if(node.parent==node)
			return node;
		
		node.parent=findParentNode(node.parent);
		
		return node.parent;
			
	}
	
	public int findParentValue(int data)
	{
		Node node=map.get(data);
		return node.parent.data;
	}

	
}
