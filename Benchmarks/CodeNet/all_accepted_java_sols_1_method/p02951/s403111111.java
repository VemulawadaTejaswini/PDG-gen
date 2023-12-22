import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      
      int Ans = C - (A-B);
      if (Ans < 0) {
    	  Ans = 0;
      }
      
      
      System.out.print(Ans);

  }
}