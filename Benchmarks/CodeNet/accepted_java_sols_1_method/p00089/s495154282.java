

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
 

public class Main{
          
     static int[][] hisigata=new int[100][100];
     static int[][] sumHisi=new int[100][100];
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line; int readC=0;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
             String spl[]=line.split(",");
             for(int i=0; i<spl.length;i++) hisigata[readC][i]=Integer.parseInt(spl[i]);
             readC++;             
             } br.close();
             int hisiSize=readC;sumHisi[hisiSize-1][0]=hisigata[hisiSize-1][0];
            for(int i=hisiSize-1;i>=hisiSize/2 ;i--){
                int hisiYouso=hisiSize-i;
                for(int j=0;j<hisiYouso;j++){
                    if(j==0)sumHisi[i][j]=hisigata[i][j]+sumHisi[i+1][j];
                    else sumHisi[i][j]=hisigata[i][j]+Math.max(sumHisi[i+1][j-1],sumHisi[i+1][j]);
                }
            }
            for(int i=hisiSize/2 -1; i>=0;i--){
                int hisiYouso=i+1;
                for(int j=0;j<hisiYouso;j++){
                    sumHisi[i][j]=hisigata[i][j]+Math.max(sumHisi[i+1][j],sumHisi[i+1][j+1]);
                }
            }
            
            /*for(int i=0;i<=8;i++){
                for(int j=0;j<=6;j++){System.out.print(sumHisi[i][j]+" ");}
                System.out.println("");
            }*/
             System.out.println(sumHisi[0][0]);
         }catch(Exception e){e.printStackTrace();}         
     }  
     
     
}