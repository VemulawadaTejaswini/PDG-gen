import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;
       int sum=0;
       while((s = br.readLine())!=null){
           if("0".equals(s))break;
           try{
               for(int i=0; i<s.length(); i++){
                   int num = s.charAt(i) - 0x30;
                   sum += num;
               }
               System.out.println(sum);
               sum=0;
           }catch(NumberFormatException e){
           }
       }
    }
}