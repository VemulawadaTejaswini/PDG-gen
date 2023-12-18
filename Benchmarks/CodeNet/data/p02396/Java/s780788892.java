import java.io.*;
import java.lang.*;

class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int count;
    while(true){
        count++;
        str = br.readLine();
        int x = Integer.parseInt(str);
            if(x == 0){
                break;}
            }
         br.close();

        String[ ] str_div = str.split("\n");
        for(int i = 0;i < str_div.length; i++){
        System.out.println("Case " + i + "; " + str_div[i]);
    }               
   }
  }  