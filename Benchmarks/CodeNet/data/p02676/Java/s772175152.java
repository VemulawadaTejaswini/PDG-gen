import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(f.readLine());
        String str = f.readLine();
        if(str.length() <= k) out.println(str);
        else out.println(str.substring(0, k)+"...");


        out.close();
    }
}
