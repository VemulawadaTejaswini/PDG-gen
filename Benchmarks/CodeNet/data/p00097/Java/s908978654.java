

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



 class Main{
     
    static long counts[][][];
    
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         try{
             String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                 
                 String[] split = line.split(" ");
                 int n=Integer.parseInt(split[0]);int s=Integer.parseInt(split[1]);
                 if(n==0&&s==0)break;
                 counts=new long[n+1][102][s+1];
                 for(int i=0;i<n+1;i++)for(int j=0;j<102;j++)for(int k=0;k<s+1;k++)counts[i][j][k]=-1;
                func(n,-1,s);
                System.out.println(counts[n][0][s]);
             }
         }catch(Exception e){}
         
     }
     
     static long func(int n, int prev,int s){
         //System.out.println(n+" "+prev+" "+s+" aa");
         if(s>=0&&n>=0)
         if(counts[n][prev+1][s]!=-1){//System.out.println(counts[n][prev+1][s]);
         return counts[n][prev+1][s];}
         if(n==0&&s==0){//System.out.println("r1");
         return 1;}
         if(s<0||n<=0){//System.out.println("r0");
         return 0;}
         
         long _count=0;
         for(int i=prev+1;i<=100-(n)+1;i++ ){
             //System.out.println("i- "+prev+1+" - "+(100-n+1)+" at"+i);
             _count+=func(n-1,i,s-i);
             //System.out.println("c+"+n+" "+prev+" "+s+" "+_count);
         }
         counts[n][prev+1][s]=_count;//System.out.println("count+"+_count+"at"+n+" "+prev+" "+s+" ");
         return _count;
     }
 }