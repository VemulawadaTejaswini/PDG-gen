import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        int count = 0;

        str = br.readLine();
        String W = str.toLowerCase();
        while((str = br.readLine()) != null){
           String x = str.toLowerCase();
           String[] temp = x.split("\\s");
           for(int i =0;i<temp.length;i++){
                if(temp[i].equals("END_OF_TEXT")){
                    break;
                }
               if(W.equals(temp[i])){
                   count++;
               }
           }
        } 
        br.close();
        System.out.println(count);
    }
}