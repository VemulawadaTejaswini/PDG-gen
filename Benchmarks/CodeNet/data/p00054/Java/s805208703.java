import java.util.*;
import java.text.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.applyPattern("0");
    df.setMaximumFractionDigits(10);
    df.setMinimumFractionDigits(10);
    while (sc.hasNext()) {
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      String str = df.format(a/b);
      int[] decimal = new int[10];
      for (int i = 0; i < 10; i++) {
        decimal[i] = (int)(str.charAt(i+2)-'0');
      }
      int n = sc.nextInt();
      int sum = 0;
      for (int i = 0; i < n; i++) {
        sum += decimal[i];
      }
      System.out.println(sum);
    }
  }
}