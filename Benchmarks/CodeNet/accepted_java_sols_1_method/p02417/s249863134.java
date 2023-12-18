import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;
       int[] num = new int[26];
       char c;
       while((s = br.readLine())!=null){
           if(s.length()>=1200)break;
           for(int j=0; j<s.length(); j++){
               c = s.charAt(j);
               if(c>=0x41 && c<=0x5a){
                   c -= 0x41;
                   num[c] += 1;
               }else if(c>=0x61 && c<=0x7a){
                   c -= 0x61;
                   num[c] += 1;
               }
           }
       }
       for(int i=0; i<26; i++){
           c = (char)(0x61 + i);
           System.out.println(c+" : "+num[i]);    
       }
    }
}