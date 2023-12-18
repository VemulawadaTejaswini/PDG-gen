

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
   
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
               String[] spl=line.split(" ");
               int n=Integer.parseInt(spl[0]),m=Integer.parseInt(spl[1]); if(n==0&&m==0)break;
               ArrayList<Integer> alInt=new ArrayList<Integer>();
               for(int i=1; i<=n;i++){alInt.add(i);}
               boolean firsttime=true;
               while(alInt.size()>1){
                   if(firsttime){firsttime=false;del_first(alInt,m);}
                   else{del_second(alInt,m);}
               }
                 System.out.println(alInt.get(0)+"");
             } br.close();
            
         }catch(Exception e){e.printStackTrace();}         
     }  
    static int prevHold=30;// -- ninn me no hito ga motteta. sakki
     static void del_first(ArrayList<Integer>alInt,int m){
         
         int num = alInt.size();prevHold=num;
         int hold=prevHold;
         for(int i=1;i<=m;i++){
             hold = (hold==num)? 1: hold+1;
         }prevHold=hold; alInt.remove(hold-1);
     }
     static void del_second(ArrayList<Integer>alInt,int m){
         int num = alInt.size();prevHold -=1;if(prevHold==0){prevHold=num;}
         int hold=prevHold;
         for(int i=1;i<=m;i++){
             hold = (hold==num)? 1: hold+1;
         }prevHold=hold; alInt.remove(hold-1);
     }
     
}
 