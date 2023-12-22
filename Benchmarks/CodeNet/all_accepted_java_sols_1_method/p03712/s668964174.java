import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    try{
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      String[] t = r.readLine().split(" ");
	  int H = Integer.parseInt(t[0]);
      int W = Integer.parseInt(t[1]);
	  char[] c = new char[W+2];
      Arrays.fill(c, '#');
      StringBuilder sb = new StringBuilder();
      sb.append(String.valueOf(c)+"\n");
      for(int i = 0; i < H; i++){
        sb.append("#");
        sb.append(r.readLine());
        sb.append("#\n");
      }
      sb.append(String.valueOf(c));
      System.out.println(sb);
    } catch(IOException e){}
  }
}