import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
import static java.lang.Math.*;

public class Main implements Runnable 
{
    static class InputReader 
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) 
        {
            this.stream = stream;
        }
        
        public int read()
        {
            if (numChars==-1) 
                throw new InputMismatchException();
            
            if (curChar >= numChars) 
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }
                
                if(numChars <= 0)               
                    return -1;
            }
            return buf[curChar++];
        }
     
        public String nextLine()
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
        public int nextInt() 
        {
            int c = read();
            
            while(isSpaceChar(c)) 
                c = read();
            
            int sgn = 1;
        
            if (c == '-') 
            {
                sgn = -1;
                c = read();
            }
            
            int res = 0;
            do
            {
                if(c<'0'||c>'9') 
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c)); 
        
            return res * sgn;
        }
		
        public long nextLong() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;
            
            do 
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
                return res * sgn;
        }
		
        public double nextDouble() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') 
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
    
        public String readString() 
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do 
            {
                res.appendCodePoint(c);
                c = read();
            } 
            while (!isSpaceChar(c));
            
            return res.toString();
        }
     
        public boolean isSpaceChar(int c) 
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
     
        public String next()
        {
            return readString();
        }
        
        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
		
    }
	
	static void sort(int a[])
	{
		ArrayList<Integer> al= new ArrayList<>();
		for(int e:a) al.add(e);
		Collections.sort(al);
		for(int i=0;i<a.length;++i) a[i]=al.get(i);
	}
	
	static int binarySearch(long pre[],long key)
	{
		int left=0,right=pre.length-1,ans=-1;
		while(left<=right)
		{
			int mid=left+((right-left)/2);
			if(pre[mid]<=key)
			{
				ans=mid;
				left=mid+1;
			}
			else right=mid-1;
		}
		return ans+1;
	}
	
    public static void main(String args[]) throws Exception 
    {
        new Thread(null, new Main(),"Main",1<<27).start();
    }
	// **just change the name of class from Main to reuquired**
    public void run()
    {
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
		
		int n=sc.nextInt(),m=sc.nextInt();
		long k=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[m];
		for(int i=0;i<n;++i) a[i]=sc.nextLong();
		for(int i=0;i<m;++i) b[i]=sc.nextLong();
		
		long pre1[]=new long[n];
		long pre2[]=new long[m];
		pre1[0]=a[0];pre2[0]=b[0];
		for(int i=1;i<n;++i) pre1[i]=pre1[i-1]+a[i];
		for(int i=1;i<m;++i) pre2[i]=pre2[i-1]+b[i];
		
		int ans=0;
		for(int i=0;i<n;++i)
		{
			if(pre1[i]<=k)
			{
				int temp=(i+1)+binarySearch(pre2,k-pre1[i]);
				ans=Math.max(ans,temp);
			}
		}
		
		for(int i=0;i<m;++i)
		{
			if(pre2[i]<=k)
			{
				int temp=(i+1)+binarySearch(pre1,k-pre2[i]);
				ans=Math.max(ans,temp);
			}
		}
		w.println(ans);
		
        System.out.flush();
        w.close();
    }
}