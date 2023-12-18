import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
import java.util.StringTokenizer; 
import java.util.Arrays;
public class Main {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
       public  FastReader()
       {
           br=new BufferedReader(new InputStreamReader(System.in));
       }
       String next()
       {
           while(st==null ||!st.hasMoreElements())
           {
               try
               {
                   st= new StringTokenizer(br.readLine());
               }
               catch(IOException e)
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
    }
    public static void main(String args[]) throws IOException
    {
        FastReader fs= new FastReader();
        long A= fs.nextLong();
        String B=fs.next();
        long res= (A* (((B.charAt(0)-'0')*100) +((B.charAt(2)-'0')*10) + (B.charAt(3)-'0')))/100;
        System.out.println(res);
    }

}