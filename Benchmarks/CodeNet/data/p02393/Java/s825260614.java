import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String[] str2 = str.split(" ");
      int a = Integer.parseInt(str2[0]);
      int b = Integer.parseInt(str2[1]);
      int c = Integer.parseInt(str2[2]);
      int[] x = {a, b, c};
      if (a > b && b > c && a > c){
        x = a;
        a = c;
        c = x;
      } else if(a > b && b < c && a ){
        x = a;
        b = a;
        a = x;
      } else if(a < b && b > c){
        x = b;
        b = c;
        }
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(a + " " + b + " " + c);
    } catch (IOException e){
      System.err.println(e.toString());
    }
  }
}
