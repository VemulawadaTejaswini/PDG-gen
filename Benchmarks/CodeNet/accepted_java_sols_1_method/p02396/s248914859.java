import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String s;
        
            int[] x=new int[10000];
            
            for(int i=0;i<10000;i++){
                try{
                    s=reader.readLine();
                    x[i]=Integer.parseInt(s);
                    
                    if(x[i]==0){
                        break;
                    }else{
                        System.out.println("Case "+(i+1)+": "+x[i]);
                    }
                }catch(IOException e){
                    System.out.println(e);
                }
            }
            
            
    }
}