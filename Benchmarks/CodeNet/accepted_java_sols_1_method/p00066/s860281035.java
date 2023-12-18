

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             
            while((line=br.readLine())!= null){if(line.isEmpty())break;
             char[] chrs = line.toCharArray();
             if(chrs[0]=='o'&&chrs[1]=='o'&&chrs[2]=='o'
                     ||chrs[3]=='o'&&chrs[4]=='o'&&chrs[5]=='o'
                     ||chrs[6]=='o'&&chrs[7]=='o'&&chrs[8]=='o'
                     ||chrs[0]=='o'&&chrs[3]=='o'&&chrs[6]=='o'
                     ||chrs[1]=='o'&&chrs[4]=='o'&&chrs[7]=='o'
                     ||chrs[2]=='o'&&chrs[5]=='o'&&chrs[8]=='o'
                     ||chrs[0]=='o'&&chrs[4]=='o'&&chrs[8]=='o'
                     ||chrs[2]=='o'&&chrs[4]=='o'&&chrs[6]=='o'
                )System.out.println("o");
             else if(chrs[0]=='x'&&chrs[1]=='x'&&chrs[2]=='x'
                     ||chrs[3]=='x'&&chrs[4]=='x'&&chrs[5]=='x'
                     ||chrs[6]=='x'&&chrs[7]=='x'&&chrs[8]=='x'
                     ||chrs[0]=='x'&&chrs[3]=='x'&&chrs[6]=='x'
                     ||chrs[1]=='x'&&chrs[4]=='x'&&chrs[7]=='x'
                     ||chrs[2]=='x'&&chrs[5]=='x'&&chrs[8]=='x'
                     ||chrs[0]=='x'&&chrs[4]=='x'&&chrs[8]=='x'
                     ||chrs[2]=='x'&&chrs[4]=='x'&&chrs[6]=='x'
                )System.out.println("x");
             else System.out.println("d");
                
            }br.close();
       
         }catch(Exception e){e.printStackTrace();}         
     }
     
}
  