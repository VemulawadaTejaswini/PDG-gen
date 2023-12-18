import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String string = scanner.next();
    int countR = 0;
    int countB = 0;
    for (int i = 0; i < n; i++) {
      if (string.charAt(i) == 'R') {
        countR++;
      } else {
        countB++;
      }
    }
    if (countR > countB) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}
