import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int sumResult = 0;
    int maxVal = 0;
    int minVal = 1000000;

    int temp = 0;
    for (int i = 0; i < count; i++) {
      temp = sc.nextInt();

      if (temp > maxVal) {
        maxVal = temp;
      } 
      if (temp < minVal) {
        minVal = temp;
      }
      sumResult += temp;
    }
    System.out.println(String.format("%d %d %d", minVal, maxVal, sumResult));
  }
}