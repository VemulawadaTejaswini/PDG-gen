import java.util.*;
import java.text.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    while (sc.hasNext()) {
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      int n = sc.nextInt();
      df.applyPattern("0");
      df.setMaximumFractionDigits(n);
      df.setMinimumFractionDigits(n);
      String str = df.format(a/b);
      int[] decimal = new int[n];
      for (int i = 0; i < n; i++) {
        decimal[i] = (int)(str.charAt(i+2)-'0');
      }
      int sum = 0;
      for (int i = 0; i < n; i++) {
        sum += decimal[i];
      }
      System.out.println(sum);
    }
  }
}