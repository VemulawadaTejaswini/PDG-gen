import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long Y = Long.parseLong(input[1]);
        int x = -1;
        int y = -1;
        int z = -1;
        
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N - i; j++){
                if(Y == 10000 * i + 5000 * j + 1000 * (N - (i + j))){
                    x = i;
                    y = j;
                    z = N - (i + j);
                    break;
                }
            }
        }
        
        out.printf("%d %d %d", x, y, z);
        out.close();
        
    }
}