import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        String S = br.readLine();
        int ans = 0;
        if (S.equals("RRS") || S.equals("SRR")) {
            ans = 2;
        }
        else if(S.equals("RRR"))
            ans = 3;
        else if(S.contains("R"))
            ans = 1;

        out.println(ans);
        

        
        out.close();
    }

    

}
