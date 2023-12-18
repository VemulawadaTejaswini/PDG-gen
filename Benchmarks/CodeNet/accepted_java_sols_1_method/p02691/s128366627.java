import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());
       
       String a[] = br.readLine().split(" ");
       
       int array[] = new int[n];
       int i=0;
      long left[] = new long[n];
    // Set<Integer> st = new HashSet<>();
       Map<Long,Integer> map = new HashMap<>();
       for(String x: a) {
           array[i] = Integer.parseInt(x); 
           left[i] = array[i]+i;
           long t =(i-array[i]);
           if(map.get(t)==null)
            map.put(t,0);
           map.put(t,map.get(t)+1);
           i+=1;
       }
       
       long count= 0;
       for(long x: left) {
           if(map.get(x)!=null)
           count+=map.get(x);
       }
       
       System.out.println(count);
       
     }
}
