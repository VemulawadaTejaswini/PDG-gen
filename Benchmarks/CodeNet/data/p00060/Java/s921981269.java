

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
                int n1 = Integer.parseInt(spl[0]);
                int n2 = Integer.parseInt(spl[1]);
                int n3 = Integer.parseInt(spl[2]);
                int my=n1+n2; int countOut=0,countSafe=0;
                for(int i=1;i<=10;i++){
                    if(i==n1||i==n2||i==n3)continue;
                    if(i+my<=20)countSafe++;
                    else countOut++;
                }
                double p = (((double)countSafe)/countOut+countSafe);
                //50<=p -> yes
                if(p>=0.5)System.out.println("YES");
                else System.out.println("NO");
             }br.close();
             
         }catch(Exception e){e.printStackTrace();}         
     }
   
 }