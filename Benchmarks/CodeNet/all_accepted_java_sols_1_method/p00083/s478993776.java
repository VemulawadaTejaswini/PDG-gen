

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
   
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                String spl[] = line.split(" ");
                int nen=Integer.parseInt(spl[0]);
                int getu=Integer.parseInt(spl[1]);
                int hi=Integer.parseInt(spl[2]);
                int mix = nen*10000+getu*100+hi;
                if(mix<18680908){System.out.println("pre-meiji");continue;}
                if(18680908<=mix&&mix<19120730){//meiji
                    int newNen=nen-1867;
                    System.out.println("meiji "+newNen+" "+getu+" "+hi);
                }else if(19120730<=mix&&mix<19261225){//taisho
                    int newNen=nen-1911;
                    System.out.println("taisho "+newNen+" "+getu+" "+hi);
                }else if(19261225<=mix&&mix<19890108){//showa
                    int newNen=nen-1925;
                    System.out.println("showa "+newNen+" "+getu+" "+hi);
                }else{//heisei
                    int newNen=nen-1988;
                    System.out.println("heisei "+newNen+" "+getu+" "+hi);
                }
                
             } br.close();
            
         }catch(Exception e){e.printStackTrace();}         
     }  
    
     
     
}
 