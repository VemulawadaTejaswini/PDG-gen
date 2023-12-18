import java.io.*;

public class Main {
 public static void main(String args[]) throws IOException {
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  int bi=Integer.parseInt(b);
  int x=Math.pow(bi, 3);
  System.out.println(x);
 }
}