import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
	public static void main(String[] args)
	{
		FastReader s=new FastReader();
		
		int t=s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			
			long[] arr=new long[n];
			
			for(int j=0;j<n;j++)
			{
				arr[j]=s.nextLong();
			}
			
			String str=s.next();
			
			ArrayList<Long> left=new ArrayList<>();
			ArrayList<Long> right=new ArrayList<>();
			
			for(int j=0;j<n;j++)
			{
				if(str.charAt(j)=='0')
				{
					right.add(arr[j]);
				}
				else
				{
					left.add(arr[j]);
				}
			}
			
			HashMap<Long,Integer> mapleft=new HashMap<>();
			HashMap<Long,Integer> mapright=new HashMap<>();
			
			for(int j=0;j<left.size();j++)
			{
				ArrayList<Long> temp=new ArrayList<>();
				
				for(Map.Entry<Long,Integer> entry:mapleft.entrySet())
				{
					temp.add(entry.getKey()^left.get(j));
				}
				
				for(int k=0;k<temp.size();k++)
				{
					mapleft.put(temp.get(k),1);
				}
				
				mapleft.put(left.get(j),1);
				
			}
			
			for(int j=0;j<right.size();j++)
			{
				ArrayList<Long> temp=new ArrayList<>();
				
				for(Map.Entry<Long,Integer> entry:mapright.entrySet())
				{
					temp.add(entry.getKey()^right.get(j));
				}
				
				for(int k=0;k<temp.size();k++)
				{
					mapright.put(temp.get(k),1);
				}
				
				mapright.put(right.get(j),1);
			}
			
			int p=0;
			
			for(Map.Entry<Long,Integer> entry:mapleft.entrySet())
			{
				if(!mapright.containsKey(entry.getKey()))
				{
					p=1;
					break;
				}
			}
			
			if(p==0)
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(1);
			}
			
		}
		
	}
	
}