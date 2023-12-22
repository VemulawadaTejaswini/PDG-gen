import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException{
        // Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        
        System.out.println((int)(Math.ceil(t/1000.0)*1000-t));


    }

    


    

}