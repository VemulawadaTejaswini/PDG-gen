import java.util.Scanner;

public class Main {
  private static int calcX(int A, int P){
    return A * P;
  }

  private static int calcY(int B, int C, int D, int P){
    return (P < C)? B : B + D * (P - C);
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int C = Integer.parseInt(sc.next());
      int D = Integer.parseInt(sc.next());
      int P = Integer.parseInt(sc.next());

      System.out.println(Math.min(calcX(A, P), calcY(B, C, D, P)));
    }
  };
}