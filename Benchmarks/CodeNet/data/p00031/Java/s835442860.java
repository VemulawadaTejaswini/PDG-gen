

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
            
            while((line=br.readLine())!=null){  if(line.equals(""))break;
                String[] splited = line.split(" ");
                int n = Integer.parseInt(splited[0]);
                int grams[] = new int[10];
                String str="";
                for(int i=0; i<10; i++){
                    grams[i]=n%2; n/=2;
                    if(grams[i]==1)str+=(int)Math.pow(2,i)+" ";
                }
                str.trim();
                System.out.println(str);
               
            }         
        }catch(Exception e){e.printStackTrace();}
        
    }
    
}