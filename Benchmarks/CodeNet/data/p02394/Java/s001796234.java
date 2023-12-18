import java.io.*;

public class Main{
 public static void main(String[] args) {
  InputStreamReader sir = new InputStreamReader (System.in);
  BufferedReader br = new BufferedReader (sir);
  try{
   String[] str = br.readLine() .split(" ");
   int W = Integer.parseInt(str[0]);
   int H = Integer.parseInt(str[1]);
   int x = Integer.parseInt(str[2]);
   int y = Integer.parseInt(str[3]);
   int r = Integer.parseInt(str[4]);
   if(x >= r && y >= r && (H - r) >= y && (W - r) >= x) {
    System.out.println("Yes");
   } else {
    System.out.println("No");
   }
  } catch (IOException e) {
   e??¢printStackTrace():
  }
 }
}