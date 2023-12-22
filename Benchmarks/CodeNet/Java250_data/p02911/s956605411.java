import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stdR = br.readLine().split(" ");
        int N = Integer.parseInt(stdR[0]);
        int K = Integer.parseInt(stdR[1]);
        int Q = Integer.parseInt(stdR[2]);
        
        int[] A = new int[N];
        
        for(int i = 0; i < Q; i++){
            int who = Integer.parseInt(br.readLine());
            A[who-1]++;
        }
        
        for(int i = 0; i < N; i++){
            int count = K - Q + A[i];
            System.out.println( (count > 0) ? "Yes" : "No" );
        }
    }
}
