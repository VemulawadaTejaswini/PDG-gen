
import java.util.Scanner;

 class Main {
	static int ar[][];
	static int nodes;
	static String color[];
	static int lastCount;
	static int parent[];
	static int breaker;
	static String ans="";
	static void doDfs(int i)
	{
		int source = i;
		color[source] = "grey";
		for(int ii = 0; ii<nodes; ii++)
		{
			if(ar[i][ii]==1)
			{
				if(color[ii]=="grey")
				{
					lastCount = ii;
					breaker = 1;
					parent[ii] = source;
					break;
				}
				else if(color[ii]=="white")
				{
					parent[ii] = source;
					doDfs(ii);
				}
			}
		}
		color[source] = "black";
		
	}
	static void printPath(int a)
	{
		int source = parent[a];
		if(source==lastCount)
		{
			System.out.println(ans+lastCount);
		}
		else
		{
			ans = ans+source+" ";
			//System.out.println("Inside");
			printPath(source);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nodes = sc.nextInt();
		int edges = sc.nextInt();
		ar =new int[nodes][nodes];
		for(int i = 0; i<edges; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			ar[a][b] = 1;
		}
		color=new String[nodes];
		parent = new int[nodes];
		for(int i =0; i<color.length; i++)
		{
			color[i] = "white";
		}
		for(int i = 0; i<color.length; i++)
		{
			if(color[i]=="white")
			{
				doDfs(i);
				if(breaker ==1)
				{
					break;
				}
			}
		}
		if(breaker==1)
		{
			System.out.println("1");
			//printPath(lastCount);
		}
		else
		{
			System.out.println("0");
		}
		

	}

}

