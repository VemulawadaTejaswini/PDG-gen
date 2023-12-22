import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();

    sc.close();

    if (C <= B && B <= A) {
      for (int i = 0; i < K; i++) {
        A = A * 2;
      }
    } else if (C <= B && A <= B) {
      for (int i = 0; i < K; i++) {
        B = B * 2;
      }
    } else {
      for (int i = 0; i < K; i++) {
        C = C * 2;
      }
    }
    
    System.out.println(A + B + C);
    
  }

}