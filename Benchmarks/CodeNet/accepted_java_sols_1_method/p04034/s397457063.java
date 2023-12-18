import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        int M = Integer.parseInt(in1[1]);
        
        int[] x = new int[M];
        int[] y = new int[M];
        for(int i = 0; i < M; i++){
            in1 = br.readLine().split(" ");
            x[i] = Integer.parseInt(in1[0]);
            y[i] = Integer.parseInt(in1[1]);
            x[i]--; y[i]--;
        }

        br.close();

        int[] ball_number = new int[N];
        boolean[] red_exist = new boolean[N];

        Arrays.fill(ball_number, 1);
        red_exist[0] = true;

        for(int i = 0; i < M; i++){
            ball_number[x[i]]--;
            ball_number[y[i]]++;

            if(red_exist[x[i]]) red_exist[y[i]] = true;
            if(ball_number[x[i]] == 0) red_exist[x[i]] = false;
        }

        int ans = 0;
        for(int i = 0; i < N; i++){
            if(red_exist[i]) ans++;
        }
        System.out.println(ans);
    }
}