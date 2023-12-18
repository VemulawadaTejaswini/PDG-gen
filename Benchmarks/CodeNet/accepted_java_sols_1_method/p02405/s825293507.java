import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        while( str != null){
        String[] strs = str.split("\\s");
        int H = Integer.parseInt(strs[0]);
        int W = Integer.parseInt(strs[1]);

        //parts
        StringBuilder kisu = new StringBuilder();
        StringBuilder gusu = new StringBuilder();
        
        if( H == 0 || W == 0){
            break;
        }else{    
            for(int i =0;i<W;i++){
                if(i == 0 || i % 2 ==0){
                    kisu.append("#");
                    gusu.append(".");
                }else{
                    kisu.append(".");
                    gusu.append("#");                           
                }
            }

            String kg = kisu.toString();
            String gg = gusu.toString();
            
            for(int i=0;i<H;i++){
                if(i==0 || i % 2 ==0){
                    System.out.println(kg);
                }else{
                    System.out.println(gg);
                }
            }

            System.out.println("");
            str = br.readLine();
            }
        }
        br.close();
    }

    
}