

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
            
             while((line=br.readLine())!= null){//if(line.isEmpty())break;
                String[] spl=line.split(" ");
                double xa1=Double.parseDouble(spl[0]);
                double ya1=Double.parseDouble(spl[1]);
                double xa2=Double.parseDouble(spl[2]);
                double ya2=Double.parseDouble(spl[3]);
                double xb1=Double.parseDouble(spl[4]);
                double yb1=Double.parseDouble(spl[5]);
                double xb2=Double.parseDouble(spl[6]);
                double yb2=Double.parseDouble(spl[7]);

               if(ya1<yb1&&ya1<yb2&&ya2<yb1&&ya2<yb2)System.out.println("NO");
               else if(ya1>yb1&&ya1>yb2&&ya2>yb1&&ya2>yb2)System.out.println("NO");
               else if(xa1>xb1&&xa1>xb2&&xa2>xb1&&xa2>xb2)System.out.println("NO");
               else if(xa1<xb1&&xa1<xb2&&xa2<xb1&&xa2<xb2)System.out.println("NO");
               else System.out.println("YES");
                
                /*if((yb-ya)*(yd-yc)==-1*(xb-xa)*(xd-xc)    )// dy1/dx1 * dy2/dx2 = -1 -> dy1*dy2 = -dx1*dx2
                 System.out.println("YES");
                else System.out.println("NO");
                 */
                
             }br.close();
             
         }catch(Exception e){e.printStackTrace();}         
     }
   
 }