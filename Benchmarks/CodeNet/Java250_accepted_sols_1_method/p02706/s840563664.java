import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);
        
        String[] input2 = br.readLine().split(" ");
        int[] cost = new int[m];
        
        for(int i = 0; i < m; i++){
            cost[i] = Integer.parseInt(input2[i]);
        }
        
        int totalCost = 0;
        
        for(int i = 0; i < m; i++){
            totalCost += cost[i];
        }
        
        out.println(n >= totalCost ? n - totalCost : -1);
        out.close();
        
    }
}