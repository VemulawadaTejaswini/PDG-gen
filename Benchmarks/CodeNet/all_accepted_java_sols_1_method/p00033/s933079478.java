

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            br.readLine();
            while((line=br.readLine())!=null){  if(line.equals(""))break;
                String[] splited = line.split(" ");
                int[] ints = new int[10];
                for(int i=0; i<10;i++)ints[i]=Integer.parseInt(splited[i]);
               int tB=ints[0],tC=-1;boolean can=true;
               for(int i=1;i<10;i++ ){
                   if(tB>tC){
                        if(ints[i]>tB){tB=ints[i];continue;}
                       if(ints[i]>tC){tC=ints[i];continue;
                       }can=false;break;
                   }else {
                       if(ints[i]>tC){tC=ints[i];continue;}
                       if(ints[i]>tB){tB=ints[i];continue;}can=false;break;}
                   
               }
                System.out.println((can)?"YES":"NO");
            }         
        }catch(Exception e){e.printStackTrace();}
        
    }
    
}