import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
          
        String line = r.readLine();    
        StringTokenizer st=new StringTokenizer(line," ");
        int buf;
        int cnt=1;
        while (st.hasMoreTokens()) {
            buf = Integer.parseInt(st.nextToken());
            if (buf == 0) break;
            System.out.println("Case "+cnt+": "+buf);
            cnt++;
        }
    }
}