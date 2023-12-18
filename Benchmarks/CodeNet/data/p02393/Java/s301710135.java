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
      Int[] x = new int[str2.length()];
      for (int i = 0; i < str2.length(); i++){
        x[i] = Integer.parseInt(str2[i]);
      }
      Array.sort(x);
      System.out.println(x[0] + " " + x[1] + " " + x[2]);
    } catch (IOException e){
      System.err.println(e.toString());
    }
  }
}
