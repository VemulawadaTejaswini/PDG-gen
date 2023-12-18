import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
         String n=in.next();
         int sum=0;
         for(int i=0;i<n.length();i++){
            int x=Character.getNumericValue(n.charAt(i));
            sum=(sum+x)%9;
         }
         if(sum%9==0){
            System.out.println("Yes");
         }
         else
            System.out.println("No");
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