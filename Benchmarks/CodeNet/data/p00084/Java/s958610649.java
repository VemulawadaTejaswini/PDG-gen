


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
   
     
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
               char[] chrs = line.toCharArray();
               StringBuilder sb=new StringBuilder("");
               ArrayList<String> alStr = new ArrayList<String>();
               for(int i=0;i<chrs.length;i++){
                   char c = chrs[i];
                   if(c==' '||c==','||c=='.'){//kugiri moji
                       String str = sb.toString();
                       if(str.length()<=6&&str.length()>=3){alStr.add(str);}
                       sb =new StringBuilder("");
                   }else{
                       sb.append(c);
                   }
               }//bun sagasi owatta
               String out= "";
               for(String strin:alStr){out+=strin+" ";}
               out=out.trim();
                 System.out.println(out);
             } br.close();
            
         }catch(Exception e){e.printStackTrace();}         
     }  
    
     
     
}
 