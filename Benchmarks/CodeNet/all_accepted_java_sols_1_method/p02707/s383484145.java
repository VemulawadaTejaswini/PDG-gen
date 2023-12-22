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
                              
                   int n =  Integer.parseInt(br.readLine());
                   HashMap<Integer,Integer>h=new HashMap<>();
                  StringTokenizer sa=new StringTokenizer(br.readLine());
                for(int i=0;i<n-1;i++){
                  
                     int p =  Integer.parseInt(sa.nextToken());
                     if(h.containsKey(p))
                     h.put(p,h.get(p)+1);
                     else
                     h.put(p,1);
                
                }
               
            //System.out.println(h.get(1));
                for(int i=0;i<n;i++){
                    if(h.containsKey(i+1))
                     System.out.println(h.get(i+1));
                     else
                System.out.println("0");
                }
                   
                
                     
    }
    }
 
