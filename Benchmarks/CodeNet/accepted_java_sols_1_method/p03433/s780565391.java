import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      String line;
      int n, a;
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      line = reader.readLine();
      n = Integer.parseInt(line);
      line = reader.readLine();
      a = Integer.parseInt(line);

      if(n%500 > a){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }
    catch (Exception e) {

    }
  }
}
