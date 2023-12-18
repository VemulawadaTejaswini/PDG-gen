


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
             String spl[] = line.split(" ");
             int a= Integer.parseInt(spl[0]);
             if(a==-1)break;
             double[] nowLoca=new double[]{1.0,1.0};
             for(int i=1; i<=a-1;i++){
                 nowLoca=nextLoca(nowLoca);
             }
                 System.out.println(nowLoca[0]);
                 System.out.println(nowLoca[1]);
                 
             } br.close();
         }catch(Exception e){e.printStackTrace();}         
     }  
    
     static double[] nextLoca(double[] nowLoca){
         double idoVx = -1*nowLoca[0]/Math.sqrt(nowLoca[0]*nowLoca[0]+nowLoca[1]*nowLoca[1]);
         double idoVy = -1*nowLoca[1]/Math.sqrt(nowLoca[0]*nowLoca[0]+nowLoca[1]*nowLoca[1]);
         //System.out.println(idoVx+" "+idoVy);
         double turnVx=idoVy, turnVy=-idoVx;
         return new double[]{nowLoca[0]+turnVx,nowLoca[1]+turnVy};
     }
     
}
 