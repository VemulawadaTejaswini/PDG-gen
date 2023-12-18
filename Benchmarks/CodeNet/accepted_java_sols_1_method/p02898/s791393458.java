import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);
        String[] input2 = br.readLine().split(" ");
        int[] numbers = new int[n];
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(input2[i]);
            if(numbers[i] >= k){
                ans++;
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}