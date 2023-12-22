import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int L = in.nextInt();
      int[] appleTaste = new int[N];
      int totalTaste = 0;
      
      for (int i = 0; i < appleTaste.length; ++i) {
        appleTaste[i] = L + i; // L + (i + 1) - i
        totalTaste += appleTaste[i];
      }

      int closestTaste = -100000000;
      for (int i = 0; i < appleTaste.length; ++i) {
        int tasteWithoutCurrent = totalTaste - appleTaste[i];
         
        if (Math.abs(totalTaste - tasteWithoutCurrent) < Math.abs(totalTaste - closestTaste)) {
          closestTaste = tasteWithoutCurrent;
        }
      }

      System.out.println(closestTaste);
    }
  }
}