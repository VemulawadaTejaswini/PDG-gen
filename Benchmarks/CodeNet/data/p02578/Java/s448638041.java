/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{ 
   
  public static void main (String[] args) throws java.lang.Exception
   {
	try{
	     //long a=Long.parseLong(next());
	    // int a=sc.nextInt();
	     Reader sc=new Reader();
	     PrintWriter out=new PrintWriter(System.out);
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  //int b[]=new int[n];
		  long sum=0;
		  for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		   
		  int maxcur=a[0];
		  for(int i=1;i<n;i++)
		   {
		     if(maxcur>a[i])
		      sum+=maxcur-a[i];
		     if(a[i]>maxcur)
		     maxcur=a[i];
		   }
		      
		   out.println(sum);  
		    
	out.flush();
	out.close();
	   }     
	catch(Exception e)
		 {}
	}
	//Template
  // static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //  static PrintWriter pw = new PrintWriter(System.out);
   //  static StringTokenizer st;
    
   //  static String next()
   //     {
   //          while(st==null || !st.hasMoreElements()) 
   //          {
   //              try
   //              {
   //                 st = new StringTokenizer(br.readLine());
   //              }
   //              catch(IOException e)
   //              {
   //                 e.printStackTrace();
   //              }
   //          }
   //          return st.nextToken();
   //     }
   // static int gcd(int a,int b)
   //  {
   //     if(b==0)
   //     return a;
   //     else
   //     return gcd(b,a%b);
   //  }
   
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 

}
