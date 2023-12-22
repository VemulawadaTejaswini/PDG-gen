import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int count = 0;
    if(A == B) count++;
    if (B == C) count++;
    if (A == C) count++;

    if (count == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}