import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      int m = in.nextInt();
       int sum = 0;
      for(int i =0; i< m; i++)
         sum += in.nextInt();
      int re = n- sum;
      if(re<0){
        System.out.println(-1);
      }else {
       System.out.println(re);
      }
    }
}