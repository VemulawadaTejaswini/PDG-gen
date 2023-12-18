import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         long a[]=new long[n];
         for(int i=0;i<n;i++){
            a[i]=in.nextLong();
         }
         long sum=0;
         for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                sum=sum+a[i-1]-a[i];
                a[i]=a[i-1];
            }
         }
         System.out.println(sum);
    }
}
class scan
{
    public static BufferedReader reader;
    public static StringTokenizer token;

    scan(InputStream str)
    {
        reader=new BufferedReader(new InputStreamReader(str));
        token=null;
    }

    static int nextInt()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Integer.parseInt(token.nextToken());
    }

    static long nextLong()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Long.parseLong(token.nextToken());
    }

    static String next()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return token.nextToken();
    }

}