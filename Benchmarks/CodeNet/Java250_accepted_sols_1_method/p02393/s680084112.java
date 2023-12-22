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
      int[] x = {Integer.parseInt(str2[0]), Integer.parseInt(str2[1]), Integer.parseInt(str2[2])};
      Arrays.sort(x);
      System.out.println(x[0] + " " + x[1] + " " + x[2]);
    } catch (IOException e){
      System.err.println(e.toString());
    }
  }
}
