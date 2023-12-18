

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

 class Main{
             
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             
             while((line=br.readLine())!= null){if(line.isEmpty())break;
                String[] spl=line.split(" ");
                int a=Integer.parseInt(spl[0]);
                int b=Integer.parseInt(spl[1]);
                int c=Integer.parseInt(spl[2]);
                double d=a/(b+0.0);int count=0;
                for(int i=0;i<c;i++){
                    d*=10;//System.out.println(d);
                    int k=(int)(d+0.000000001);//System.out.println(k);
                    count+=k%10;
                }
                 System.out.println(count);
                
             }
             
         }catch(Exception e){}         
     }
   
 }