//I AM THE CREED
/* //I AM THE CREED
/* package codechef; // don't place package name! */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException 
    { 
  
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
          int n=input.nextInt();
          String s=input.next();
          
          int min=Integer.MAX_VALUE;
          int r=0;
          for(int i=s.length()-1;i>=0;i--){
              if(s.charAt(i)=='R'){
                 min=Math.min(min, Math.max(i, r)); 
                 r++;
              }
          }
          min=Math.min(s.length()-r, min);
          System.out.println(min);
        }
        
    }
    


}