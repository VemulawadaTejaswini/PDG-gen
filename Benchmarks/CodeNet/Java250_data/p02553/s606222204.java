import java.util.*;
import java.util.Scanner;
import java.io.*;
import javax.lang.model.util.ElementScanner6; 

public class Main
{

    public static void main(String args[])
    {  

        FastReader in=new FastReader();
        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t=1;
     
        //t=in.nextInt();
        while(t-->0)
        {
           long a=in.nextLong();
           long b=in.nextLong();
           long c=in.nextLong();
           long d=in.nextLong();
           
                long m1=a*c;
                long m2=a*d;
                long m3=b*c;
                long m4=b*d;
                pr.println(Math.max(m1,Math.max(m2,Math.max(m3, m4))));
            

        }
        pr.flush();
    }



    
    static int gcd(int a,int b)
    {
        
        if(a==0)
            return b;
        return gcd(a%b,b);
    }

    static int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }


    static boolean prime[];

    static void sieveofe()
    {
        int n=1000000;
      
        prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
      
        
    }
    
    static void sort(long[] a) {
		ArrayList<Long> l = new ArrayList<>();
		for (long i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
	}
    
    
	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
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