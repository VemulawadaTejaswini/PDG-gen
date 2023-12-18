


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
    static int n=0;
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                String spl[] = line.split(",");
               int q = Integer.parseInt(spl[0]); if(q==-1)break;
               double x=(double)q/2;
               while(true){
                   x=x-(x*x*x-q)/(3*x*x);
                   if(Math.abs(x*x*x-q)<0.00001*q)break;
               }
                 System.out.println(x);
               
             } br.close();
            
         }catch(Exception e){e.printStackTrace();}         
     }  
    
     
     
}
 