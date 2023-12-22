import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String[] str2 = str.split(" ");
      int w = Integer.parseInt(str2[0]);
      int h = Integer.parseInt(str2[1]);
      int x = Integer.parseInt(str2[2]);
      int y = Integer.parseInt(str2[3]);
      int r = Integer.parseInt(str2[4]);
      if (w >= (x + r) && (x - r) >= 0 && h >= (y + r) && (y -r) >= 0){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } catch(IOException e){
      System.err.println(e.toString());
    }
  }
}
