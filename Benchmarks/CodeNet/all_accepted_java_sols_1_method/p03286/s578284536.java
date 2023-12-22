import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
  
    while (in.hasNext()) {
      int N = in .nextInt();
      StringBuilder baseNeg2 = new StringBuilder();
     
      while (N != 0) {
        if (N % 2 != 0) {
          baseNeg2.insert(0, 1);
          --N;
        } else {
          baseNeg2.insert(0,0);
        }

        N /= -2;
      }
      
      if (baseNeg2.length() == 0) {
        baseNeg2.append(0);
      }

      System.out.println(baseNeg2);
    } 
  }
}