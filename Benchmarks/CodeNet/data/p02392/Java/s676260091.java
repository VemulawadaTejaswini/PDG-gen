import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String[] str2 = str.split(" ");
      int a = Integer.parseInt(str2[0]);
      int b = Integer.parseInt(str2[1]);
      int c = Integer.parseInt(str2[2]);
      if (a < b && b < c){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } catch(IOException e) {
      System.err.println(e.toString());
    }
  }
}
