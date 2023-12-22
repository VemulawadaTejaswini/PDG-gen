import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String a[] = br.readLine().split(" ");
       
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        Set<Integer> set = new HashSet<>();
        int height[] = new int[n];
        a = br.readLine().split(" ");
        int i=0;
        for(String x:a) height[i++] = Integer.parseInt(x);
        
        int maxHeight[] = new int[n];
        while(m-->0) {
            String temp = br.readLine();
            a = temp.split(" ");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            maxHeight[x-1] = Math.max(maxHeight[x-1],height[y-1]);
            maxHeight[y-1] = Math.max(maxHeight[y-1],height[x-1]);
        }
        int count = 0;
        for( i=0;i<maxHeight.length;i++) if(maxHeight[i]<height[i])count++;
        
      
        System.out.println(count);
       
     }
}
