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
      if (a < b){
        System.out.println("a < b");
      } else if (a > b){
        System.out.println("a > b");
      } else {
        System.out.println("a == b");
      }
    } catch(IOException e){
      System.err.println(e.toString());
    }
  }
}
