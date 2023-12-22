import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
 
public class Main 
{ 
    
    
    public static void main(String[] args) throws IOException 
    { 
  
       BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in));
                              
                  StringTokenizer s=new StringTokenizer(br.readLine());
                   int n =  Integer.parseInt(s.nextToken());
                    int m =  Integer.parseInt(s.nextToken());
                int sum=0;
                  StringTokenizer sa=new StringTokenizer(br.readLine());
                for(int i=0;i<m;i++){
                  
                     int p =  Integer.parseInt(sa.nextToken());
                sum+=p;
                }
               
             
                 if(sum>n)
                 System.out.println("-1");
                 else
                 System.out.println(n-sum);
                   
                
                     
    }
    }
 