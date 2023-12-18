import java.io.*;

public class Main{
  public static void main(String[] args){
    int i = 1;
    while(true){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int x = Integer.valueOf(br.readLine());
      if (x == 0)
        break;
      else
        System.out.println("Case " + i++ + ": " + in);
      }
  }
}