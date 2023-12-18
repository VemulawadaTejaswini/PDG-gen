import java.io.*;

public class Main {
  public static void main(String[] args){

    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String radius = reader.readLine();
      double r = Double.parseDouble(radius);
      double circleArea = r * r * Math.PI;
      double circumference = 2 * Math.PI * r;
      System.out.printf("%f %f\n", circleArea, circumference);
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("数字が正しくありません");
    }
  }
}

