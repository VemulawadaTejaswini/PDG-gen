import java.util.*;
public class Main{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		List<Integer> li=new ArrayList<Integer>();
		List<Integer> li1=new ArrayList<Integer>();
		int arr[]=new int[t];
		for(int i=0;i<arr.length;i++)
		{
			li.add(sc.nextInt());
		}
		int q=sc.nextInt();
		for(int i=1;i<=q;i++)
		{
			int b=sc.nextInt();
			int c=sc.nextInt();
			int x=li.indexOf(b);
			li.set(x,c);
			int sum=0;
			for(int k=0;k<li.size();k++)
			{
				sum=sum+li.get(k);
			}
			li1.add(sum);
		}
		for(int i=0;i<li1.size();i++)
		{
			System.out.println(li1.get(i));
		}
		
		
	}

}
