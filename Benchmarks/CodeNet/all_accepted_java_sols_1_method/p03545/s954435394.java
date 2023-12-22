import java.util.*;

public class Main {
  private static char[] op1 = { '+', '+', '+', '+', '-', '-', '-', '-' };
  private static char[] op2 = { '+', '+', '-', '-', '+', '+', '-', '-' };
  private static char[] op3 = { '+', '-', '+', '-', '+', '-', '+', '-' };
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] n = sc.next().toCharArray();
    int A = n[0] - '0';
    int B = n[1] - '0';
    int C = n[2] - '0';
    int D = n[3] - '0';
    for (int i = 0; i < 8; i++) {
      int sum = A;
      if (op1[i] == '+') {
        sum += B;
      } else {
        sum -= B;
      }
      if (op2[i] == '+') {
        sum += C;
      } else {
        sum -= C;
      }
      if (op3[i] == '+') {
        sum += D;
      } else {
        sum -= D;
      }
      if (sum == 7) {
        System.out.println(""+A+op1[i]+B+op2[i]+C+op3[i]+D+"=7");
        return;
      }
    }
  }
}