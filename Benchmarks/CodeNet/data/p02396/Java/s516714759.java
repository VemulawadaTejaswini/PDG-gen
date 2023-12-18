import java.io.*;
import java.lang.*;

class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        
    while(str != null)
        str.append(br.readLine());
        br.close();

        String[ ] str_div = str.split("\n");
        for(int i = 0;i < str_div.length; i++){
        System.out.println("Case " + i + "; " + str_div[i]);
    }          
  }       
   }