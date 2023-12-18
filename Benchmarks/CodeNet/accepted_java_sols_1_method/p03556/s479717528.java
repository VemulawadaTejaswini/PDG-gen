import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int A = 1;
      int ANS = 0;

      while(A * A <= N) {
          ANS = A * A;
          A++;
      }

      System.out.println(ANS);


    }
}