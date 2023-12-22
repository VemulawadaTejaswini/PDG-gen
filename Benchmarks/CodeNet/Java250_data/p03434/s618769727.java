import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        
        String[] input = br.readLine().split(" ");
        Integer[] numbers = new Integer[n];
        
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.valueOf(input[i]);
        }
        
        Arrays.sort(numbers, Collections.reverseOrder());
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                a += numbers[i];
            }else{
                b += numbers[i];
            }
        }
        
        out.println(a - b);
        out.close();
        
    }
}