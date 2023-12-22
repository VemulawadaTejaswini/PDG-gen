import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line1 = br.readLine();
      String str[] = line1.split(" ");
      int n = Integer.parseInt(str[0]),x = Integer.parseInt(str[1]);
      
      String line2 = br.readLine();
      String str2[] = line2.split(" ");
      long[] candyList = new long[n];  
      for(int i =0;i<n;i++){
         candyList[i] = Integer.parseInt(str2[i]);     
      }
      long count=0;
      if(candyList[0]>x){
        count = candyList[0]-x;
        candyList[0]=x;
      }
      for(int i=0;i<n-1;i++){
        long candyNum = candyList[i]+candyList[i+1];
        if(candyNum>x){
          count = count + (candyNum-x);
          candyList[i+1]=(candyList[i+1]-(candyNum-x));
        }
      }
       System.out.println(count); 
	}
}