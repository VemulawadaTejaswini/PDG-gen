import java.io.*;
import java.util.*;
public class Main {        
    public static void main(String args[]) {
        int x=II();
        int ans=0;
        if(x<=599)
            ans=8;
        else if(x<=799)
            ans=7;
        else if(x<=999)
            ans=6;
        else if(x<=1199)
            ans=5;
        else if(x<=1399)
            ans=4;
        else if(x<=1599)
            ans=3;
        else if(x<=1799)
            ans=2;
        else
            ans=1;

        System.out.println(ans);
    }
    
    ////////////////////////////////////
    static scan in=new scan(System.in);
    static int II() {
        return in.nextInt();
    }
    static long IL() {
        return in.nextLong();
    }
    static int[] IIA(int n) {
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=II();
        }
        return a;
    }
    static String IS() {
        return in.next();
    }
    static char IC(){
        return in.next().charAt(0);
    }
    static String[] ISA(int n) {
        String a[]=new String[n];
        for(int i=0;i<n;i++) {
            a[i]=IS();
        }
        return a;
    }
    static char[] ICA(int n) {
        char a[]=new char[n];
        for(int i=0;i<n;i++) {
            a[i]=IC();
        }
        return a;
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