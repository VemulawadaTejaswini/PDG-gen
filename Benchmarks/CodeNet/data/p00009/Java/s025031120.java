import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] primeNumbers = new int[1000000];

    primeNumbers[0] = 0;
    primeNumbers[1] = 0;
    primeNumbers[2] = 1;
    primeNumbers[3] = 1;
    primeNumbers[4] = 0;
    for (int i = 5; i < 1000000; i++) {
      for (int j = 2; j*j <= i; j++) {
        if (i % j == 0) {
          primeNumbers[i] = 0;
          break;
        } else {
          primeNumbers[i] = 1;
        }
      }
    }

    while (sc.hasNext()) {
      int primeNumber = 0;
      int n = sc.nextInt();

      for (int i = 0; i <= n; i++) {
        primeNumber += primeNumbers[i];
      }

      System.out.println(primeNumber);
    }
  }
}