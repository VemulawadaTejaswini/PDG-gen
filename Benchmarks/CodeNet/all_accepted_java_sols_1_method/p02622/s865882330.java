import java.util.*;
import java.io.*;
class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      String t = br.readLine();
      StringBuilder sb1 = new StringBuilder(t);
      //System.out.println(s);
      int ans = 0;
      for(int i=0;i<s.length();i++){
        if(s.equals(t)){
          break;
        }else{
          char s1 = s.charAt(i);
          char t1 = t.charAt(i);
          if(!(s1==t1)){
            ans++;
            sb1.setCharAt(i, s1);
         }
       }
      }
       System.out.println(ans);
    }catch(IOException e){
       System.out.println(e);
    }
  }
}