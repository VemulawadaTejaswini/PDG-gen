import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    double num;

    num = sc.nextInt();

    double temporaryNum = 1;
    if (num < 4) {
      System.out.println(1);
      return;
    }

    for (int i = 2; Math.pow(i, 2) <= num; i++) {
      for (int n = 2; Math.pow(i, n) <= num; n++) {
         if (temporaryNum < Math.pow(i, n)) {
           temporaryNum = Math.pow(i, n);
         }
      }
    }
    System.out.println((int)temporaryNum);
    return;
  }
}
