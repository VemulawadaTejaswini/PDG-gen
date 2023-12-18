import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();
      int K = in.nextInt();
      long max = Math.max(A, Math.max(B, C));
      long replacedMax = max;

      while (K-- > 0){
        replacedMax *= 2;
      }
  
      System.out.println(replacedMax + A + B + C - max);
    }
  }
}