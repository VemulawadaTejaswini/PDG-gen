

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
    static int n=0;
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
             String spl[] = line.split(" ");
             int a= Integer.parseInt(spl[0]);
             if(a==0)break;
             n=a;//static
             int mahozin[][] = new int[a][a];
             int xy[] ={ a/2, a/2+1 }; int nCounter=1;
             while(true){
                 //System.out.println(xy[0]+" "+xy[1]+" "+nCounter);
                 if(nCounter>=a*a+1)break;
                 if(mahozin[xy[1]][xy[0]]==0){
                     mahozin[xy[1]][xy[0]]=nCounter;
                     nCounter++; xy=migisita(xy);
                }else{//umatteru
                     xy=hidarisita(xy);
                 }
             }
             for(int y=0;y<a;y++){
                 for(int x=0;x<a;x++) System.out.print(_4keta(mahozin[y][x]));
                 System.out.println("");
             }
             } br.close();
         }catch(Exception e){e.printStackTrace();}         
     }  
    static String _4keta(int n){
        if(n/10==0) return "   "+n;
        if(n/100==0) return "  "+n;
        if(n/1000==0) return " "+n;
        return n+"";
    }
     static int[] migisita(int[] inV){
         int nowX = inV[0], nowY=inV[1];
         int nexX = (nowX==n-1)? 0 : nowX+1;
         int nexY = (nowY==n-1)? 0 : nowY+1;
         return new int[]{nexX, nexY};         
     }
     static int[] hidarisita(int[] inV){
         int nowX = inV[0], nowY=inV[1];
         int nexX = (nowX==0)? n-1 : nowX-1;
         int nexY = (nowY==n-1)? 0 : nowY+1;
         return new int[]{nexX, nexY};         
     }
     
}
 