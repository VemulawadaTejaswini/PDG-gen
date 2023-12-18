

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
                int n=Integer.parseInt(spl[2]);
                double d=a/(b+0.0);int s=0;
                /*for(int i=0;i<n;i++){
                    //a*=10;
                    //s += (a/b)%10;
                    //a = a%b;
                    d*=10;System.out.println(d);
                    int k=(int)(d);//System.out.println(k);
                    s+=k%10;
                }*/
                String str=String.valueOf(d);//System.out.println(d);
                String spl2[]=str.split("\\."); char chrs[]=spl2[1].toCharArray();
                for(int i=0;i<n;i++){
                    s+=Integer.parseInt(chrs[i]+"");
                }
                 System.out.println(s);
                
             }br.close();
             
         }catch(Exception e){}         
     }
   
 }