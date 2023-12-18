import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pow{
 public static void main (String[] args) throws java.lang.Exception
 {
 InputStreamReader is = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(is);
  
  double pow = 3;
  System.out.println("入力した値を"+pow+"乗した値を出力します");
  System.out.println("数値を入力してください");
  double x = Integer.parseInt(br.readLine());
  double kotae = Math.pow(x,pow);
  System.out.println(x+"を"+pow+"乗した値は"+kotae+"です\r\n");
  // your code goes here
 }
}
