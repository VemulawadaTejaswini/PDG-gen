import java.io.*;
import java.util.*;
public class Main {        
    public static void main(String args[]) {
        int n=II();
        int k=II();

        int a[]=IIA(n);

        for(int i=0;i<n-k;i++){
            if(a[i+k]>a[i])
                System.out.println("Yes");
            else
                System.out.println("No");
        }

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