import java.io.*;
public class Main{
  public static void main(String[] args){
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 	  int N, M;
      String[] s = bf.readLine().split(" ");
      N = Integer.parseInt(s[0]);
      M = Integer.parseInt(s[1]);
      int p = 1 << M;
      int X = (M*1900+(N-M)*100)*p;
      System.out.println(X);
    } catch(IOException e){}
  }
}
    