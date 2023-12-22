import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    long L0 = 2;
    long L1 = 1;
    if (N == 1) {
      System.out.println(L1);
      return;
    }
    long L2 = 3;
    for (int i = 2; i <= N; i++) {
      L2 = L1 + L0;
      L0 = L1;
      L1 = L2;
    }
    System.out.println(L2);
  }
}