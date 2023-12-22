import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
      String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
      int[] n1 = new int[n];
      String a = br.readLine();
      String[] split1 = a.split(" ");
      BigInteger count =BigInteger.ZERO;
      
      for(int i=0;i<n;i++){
        n1[i]= Integer.parseInt(split1[i]);
      }
       if(n<=k){
    	   System.out.println(count);
      } else {
      Arrays.sort(n1);
     
     for(int x=0;x<n1.length-k;x++){
       count= count.add(BigInteger.valueOf(n1[x]));
     }
     System.out.println(count);
      }
     
         
    
     
    
}
}
