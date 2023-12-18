

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             int cnt=0;
            while((line=br.readLine())!= null){if(line.isEmpty())break;
                char[] chars = line.toCharArray();
                StringBuilder sb = new StringBuilder("");
                for(int i=0; i<chars.length; i++){
                    if('0'<=chars[i]&&chars[i]<='9'){
                        sb.append(chars[i]);
                    }else{
                        if(sb.length()>0){cnt+=Integer.parseInt(sb.toString()); 
                            sb=new StringBuilder("");}
                        
                        
                    }
                }
                if(sb.length()>0){cnt+=Integer.parseInt(sb.toString()); 
                            sb=new StringBuilder("");}
                                        
            }             br.close();
             System.out.println(cnt);
         }catch(Exception e){e.printStackTrace();}         
     }
     
}
  