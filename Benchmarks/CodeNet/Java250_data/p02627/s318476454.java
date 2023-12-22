import java.util.*;
import java.io.* ;

public class Main
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in) ;
        PrintWriter out = new PrintWriter(System.out) ;
        char c = sc.next().charAt(0);
        if(Character.isUpperCase(c))
            out.println('A');
        else
            out.println('a');

        out.flush();
        out.close();
    }
    static class Scanner
    {
        BufferedReader br ;
        StringTokenizer st ;

        Scanner(InputStream in)
        {
            br = new BufferedReader(new InputStreamReader(in)) ;
        }

        String next() throws Exception
        {
            while(st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine()) ;
            return st.nextToken() ;
        }

        int nextInt() throws Exception { return Integer.parseInt(next()) ; }

        long nextLong() throws Exception {return Long.parseLong(next()) ; }
    }
}