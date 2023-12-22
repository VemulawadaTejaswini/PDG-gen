import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();

    long p = 1;
    long sum = 0;
    for (int i = 0; i < n; i++) {
      if (p%5 == 0 || p%3 == 0) {
        p++;
        continue;
      } else {
        sum += p;
        p++;
      }
    }
    System.out.println(sum);
  }
}