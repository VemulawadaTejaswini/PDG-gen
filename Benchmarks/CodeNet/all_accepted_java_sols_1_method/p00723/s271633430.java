import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(br.readLine());

    while(m-- > 0){
      String s = br.readLine();
      int len = s.length();
      HashSet<String> set = new HashSet<String>();

      for(int i=1;i<len;i++){
        String a = s.substring(0,i);
        String b = s.substring(i,len);
        String ra = new StringBuilder(a).reverse().toString();
        String rb = new StringBuilder(b).reverse().toString();

        set.add(a + b);
        set.add(a + rb);
        set.add(ra + b);
        set.add(ra + rb);
        set.add(b + a);
        set.add(b + ra);
        set.add(rb + a);
        set.add(rb + ra);
      }

      System.out.println(set.size());
    }
  }
}