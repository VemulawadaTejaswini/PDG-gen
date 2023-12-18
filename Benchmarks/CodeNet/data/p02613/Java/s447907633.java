import java.util.Scanner;
class Main {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    for (int i = 1; i <= N; i++) {
      String S = sc.next();
      switch (S) {
        case "AC": a++; break;
        case "WA": b++; break;
        case "TLE": c++; break;
        case "RE": d++; break;
      }
    }
    System.out.println("AC ×　" + a);
    System.out.println("WA ×　" + b);
    System.out.println("TLE ×　" + c);
    System.out.println("RE ×　" + d);
  }
}