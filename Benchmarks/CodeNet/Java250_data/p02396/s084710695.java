import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in));       
        String line = r.readLine();   
        
        int cnt=1;
        while(line!=null){ 
            int buf = Integer.parseInt(line);
            if (buf == 0) break;
            if (cnt > 10000) break;
            if (1 <= buf && buf <= 10000){
                System.out.println("Case "+cnt+": "+buf);
                cnt++;
            }
            line = r.readLine();
        }        
    }
}