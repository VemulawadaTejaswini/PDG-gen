import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String a[] = br.readLine().split(" ");
       
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);
        Set<Integer> st = new HashSet<>();
        while(k-->0) {
            int count= Integer.parseInt(br.readLine());
            
            String array[] = br.readLine().split(" ");
            for(String x: array) st.add(Integer.parseInt(x));
            
        }
        
        System.out.println(n-st.size());
     }
}