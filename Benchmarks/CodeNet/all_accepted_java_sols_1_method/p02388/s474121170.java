import java.io.*;

public class Main {
  public static void main(String[] args){

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String line = reader.readLine();
      int x = Integer.parseInt(line);
      int cubedX = x * x * x;
      System.out.println(cubedX);
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("数字が正しくありません");
    }
  }
}

