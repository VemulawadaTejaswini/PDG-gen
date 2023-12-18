import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(f.readLine());
        long[] arr = new long[n+1];
        StringTokenizer st = new StringTokenizer(f.readLine());
        long sum = 0;
        for(int i = 0; i < n+1; i++){
            arr[i] = Long.parseLong(st.nextToken());
            sum+=arr[i];
        }
        long currLeaves = 1;
        long totalNodes = 1;
        boolean good = true;
        if(n != 0 && arr[0] != 0){
            out.println(-1);
            out.close();
            System.exit(0);
        }
        if(n == 0 && arr[0] == 1){
            out.println(1);
            out.close();
            System.exit(0);
        }else if(n == 0){
            out.println(-1);
            out.close();
            System.exit(0);
        }
        for(int i = 1; i <= n; i++){
            currLeaves = Math.min(2*currLeaves, sum);
            totalNodes+=currLeaves;
            if(arr[i] > currLeaves){
                good = false;
                break;
            }
            currLeaves -= arr[i];
            sum-= arr[i];
        }
        if(good){
            out.println(totalNodes);
        }else{
            out.println(-1);
        }





        out.close();
    }
}
