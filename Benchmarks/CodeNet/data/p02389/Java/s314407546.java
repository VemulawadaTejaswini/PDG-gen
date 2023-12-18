import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //try {
      Scanner input = new Scanner(System.in);
      int height = Integer.valueOf(input.next());
      int width = Integer.valueOf(input.next());
      
      //if (1 <= height && width <= 100) {
        int squareArea = calcSquareArea(height, width);
        int squarePerimeter = calcSquarePerimeter(height, width);
        System.out.println(squareArea + " " + squarePerimeter);
      //}
    //} catch (IOException e) {
      //System.exit(0);
    //}
  }

  private static int calcSquarePerimeter(int height, int width) {
    return (height * 2) + (width * 2);
  }

  /**
   * 四角形の面積を計算する
   * @param height
   * @param width
   * @return
   */
  private static int calcSquareArea(int height, int width) {
    return height * width;
  }
}
