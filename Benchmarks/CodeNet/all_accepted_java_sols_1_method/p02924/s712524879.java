import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long sum = 0;
    if (n == 1) sum = 0;
    else {
      for (int i = 1; i < n; i++) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
