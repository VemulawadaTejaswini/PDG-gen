import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int n1 = n / 100;
    int n2 = n % 100;
    if (1 <= n1 && n1 <= 12 && (n2 == 0 || 13 <= n2))
      System.out.println("MMYY");
    else if (1 <= n2 && n2 <= 12 && (n1 == 0 || 13 <= n1))
      System.out.println("YYMM");
    else if ((n1 == 0 || 13 <= n1) && (n2 == 0 || 13 <= n2))
      System.out.println("NA");
    else
      System.out.println("AMBIGUOUS");
  }
}
