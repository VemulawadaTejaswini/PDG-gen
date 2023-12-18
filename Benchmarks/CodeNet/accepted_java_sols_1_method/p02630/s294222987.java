//package ABC171;
import java.util.*;
import java.io.*;
import java.lang.*;
class Main {

	public static void main(String[] args) throws IOException{
		
		
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int a[]=new int[n];
		String s[]=br.readLine().split(" ");
		HashMap<Integer,Integer> hm=new HashMap<>();
		long sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(s[i]);
			hm.put(a[i],hm.getOrDefault(a[i],0)+1);
			sum+=a[i];
			
		}
		int q=Integer.parseInt(br.readLine());
		int qr[]=new int[q];
		for(int i=0;i<q;i++)
		{
			String ss[]=br.readLine().split(" ");
			int b=Integer.parseInt(ss[0]);
			int c=Integer.parseInt(ss[1]);
			
			
			if(hm.containsKey(b)==false)
			{
				System.out.println(sum);
				
			}
			else
			{
				int count=hm.get(b); //occurence of b;
				long change=(c-b)*count;
				sum=sum+change;
				hm.remove(b);
				hm.put(c,hm.getOrDefault(c,0)+count);
				System.out.println(sum);
			}
		}
		

	}

}
