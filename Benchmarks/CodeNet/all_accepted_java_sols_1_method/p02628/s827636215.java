import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] strNum = br.readLine().split(" ");
        String[] strPrice = br.readLine().split(" ");
        int n = Integer.parseInt(strNum[0]);
        int k = Integer.parseInt(strNum[1]);
        Integer[] price = new Integer[n];
        
        for(int i = 0; i < price.length; i++){
            price[i] = Integer.valueOf(strPrice[i]);
        }
        
        Arrays.sort(price);
        
        int sum = 0;
        
        for(int i = 0; i < k; i++){
            sum += price[i];
        }
        
        out.println(sum);
        
        out.flush();
        out.close();
        
    }
}