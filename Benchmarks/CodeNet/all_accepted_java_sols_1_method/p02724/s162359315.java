import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    int ans = 0;
    while(x >= 5){
      if(x >= 500){
        ans += 1000 * (x / 500);
        x %= 500;
      } else {
        ans += 5 * (x/5);
        x %= 5;
      }
    }
    System.out.println(ans);
  }
}