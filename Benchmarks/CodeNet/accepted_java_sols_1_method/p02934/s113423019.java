import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[] data = new int[n];
      double sum = 0;

      for (int i = 0;i<n;i++ ) {
      data[i] = sc.nextInt();
      sum = sum + (double)1/data[i];
      }

      System.out.println(1/sum);
  }

}