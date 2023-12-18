

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) 
	{
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int curs = 0;
		LinkedList<Integer> l = new LinkedList<Integer>();
		ListIterator<Integer> lit = l.listIterator();
		lit.add(-1000000001);
		lit.previous();
//		System.out.println(lit + " " + lit.previous());
		
		for(int i = 0; i < n; i++)
		{
//			System.out.println(l);
			int com = sc.nextInt();
			if(com == 0)
			{ //insert
//				l.add(curs, sc.nextInt());
				lit.add(sc.nextInt());
				lit.previous();
			}
			else if(com == 1)
			{ //move
//				curs += sc.nextInt();
				int arg = sc.nextInt();
				if(arg > 0)
				{
					for(int k = 0; k < arg && lit.hasNext(); k++)
					{
						lit.next();
					}
				}
				else
				{
					for(int k = 0; k < -arg && lit.hasPrevious(); k++)
					{
						lit.previous();
					}
				}
				
				if(!lit.hasNext() && lit.hasPrevious())lit.previous();
			}
			else
			{ //erase
//				System.out.println("Removing " + lit.previous());
				if(lit.hasNext())
				{
					lit.next();
					lit.remove();
				}
				else
				{
				}
//				System.out.println(l);
//				curs = Math.min(curs, l.size());
//				if(curs < 0)curs = 0;				
//				l.remove(curs);
			}
			
		}
		
//		System.out.println("TOT " + l.size());
		int ii = 0;
		
		
		for(int i : l)
		{
			if(i >= -1000000000)
			{
				if(ii > 0)sb.append("\n");
				sb.append(i);
				ii++;
			}
		}
		
		
		/*
		while(!l.isEmpty())
		{
			if(ii > 0)sb.append("\n");
			sb.append(l.poll());
			ii++;
		}
		*/

		System.out.println(sb);
		// TODO Auto-generated method stub

	}
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

}

