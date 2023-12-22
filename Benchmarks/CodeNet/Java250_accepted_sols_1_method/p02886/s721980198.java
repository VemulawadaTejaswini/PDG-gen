import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[n];
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                ans += numbers[i] * numbers[j];
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}