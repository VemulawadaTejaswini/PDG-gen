import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int N=in.nextInt();//うさぎの数
			int K=in.nextInt();//ボートの数
			HashMap<Integer, ArrayList<Integer>>HM=new HashMap<Integer, ArrayList<Integer>>();
			HashSet<Integer>Ans=new HashSet<Integer>();
			for(int i=0;i<K;i++)
			{
				int n=in.nextInt();
				ArrayList<Integer>AL=new ArrayList<Integer>();
				for(int j=0;j<n;j++)
					AL.add(in.nextInt());
				HM.put(i,AL);
			}
			
			int R=in.nextInt();//気分を悪くするウサギの組
			for(int i=0;i<R;i++)
			{
				int a=in.nextInt();
				int b=in.nextInt();
				
				for(int j=0;j<HM.size();j++)
				{
					boolean j1=false;
					boolean j2=false;
					ArrayList<Integer>A=new ArrayList<Integer>(HM.get(j));
					for(int k=0;k<A.size();k++)
					{
						if(a==A.get(k))
							j1=true;
						if(b==A.get(k))
							j2=true;
					}
					if(j1&&j2)
					{
						Ans.add(a);
						Ans.add(b);
					}
				}	
			}
			System.out.println(Ans.size());
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}