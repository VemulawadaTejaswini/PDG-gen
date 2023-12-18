import java.io.*;
class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while(null != (s=in.readLine()))
          print(Integer.parseInt(s));
  }
  private static void print(int n){
    int s=((int)Math.pow(n,2)+n+2)/2;
    System.out.println(s);
  }
}