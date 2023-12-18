import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String input = in.nextLine();

    int[] a = {
      1819,
      2003,
      876,
      2840,
      1723,
      1673,
      3776,
      2848,
      1592,
      922
    };

    Arrays.sort(a);

    for(int i = 0; i < 3; i++) {
      System.out.println(a[a.length - 1 - i]);
    }  
  }
}