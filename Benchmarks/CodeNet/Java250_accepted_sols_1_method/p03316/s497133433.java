import java.io.*;
  import java.util.*;

  class Main{
    public static void main(String[] args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] t=s.split("");
        long count=0;
        for(int i=0;i<s.length();i++){
          count+=Integer.parseInt(t[i]);
        }
        long n=Long.parseLong(s);
        if((n%count)==0)
         System.out.println("Yes");
         else
          System.out.println("No");
      }
    }