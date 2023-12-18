import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        while((str = br.readLine()) != null){
            StringBuilder abcde =new StringBuilder(str);
            str = br.readLine();
            int num = Integer.parseInt(str);
            for(int i =0;i < num;i++){
                str = br.readLine();
                String[] temp = str.split("\\s");
                if(temp[0].equals("replace")){
                    //replace
                    int a = Integer.parseInt(temp[1]);
                    int b = Integer.parseInt(temp[2]) + 1;
                    abcde.replace(a,b,temp[3]);

                }else if(temp[0].equals("reverse")){
                    //reverse
                    int a = Integer.parseInt(temp[1]);
                    int b = Integer.parseInt(temp[2]) + 1;
                    StringBuilder rev = new StringBuilder(abcde.substring(a,b)).reverse();
                    abcde.replace(a,b,rev.toString());
                }else{
                    //print
                    int a = Integer.parseInt(temp[1]);
                    int b = Integer.parseInt(temp[2]) + 1;                             
                    System.out.println(abcde.substring(a,b));
                }
            }
        }
        br.close();
                  
    }

}
