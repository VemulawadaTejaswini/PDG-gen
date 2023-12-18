import java.util.*;
import java.io.*;

public class C {
    public static int max = 2000001;
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        long k = Long.parseLong(f.readLine());
        long val = 7;
        boolean found = false;
        for(int i = 1; i <= max; i++){
            if(val % k == 0){
                out.println(i);
                found = true;
                break;
            }
            else{
                val = (10*val+7)%k;
            }
        }
        if(!found) out.println(-1);




        out.close();
    }
}
