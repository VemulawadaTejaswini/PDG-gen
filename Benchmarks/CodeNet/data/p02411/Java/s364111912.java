import java.util.*;

class Main{
  static int m,f,r;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int m= sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      if (m == -1 && f == -1 && r == -1) {
        break;
      }
      int total = m + f;
      if (total >= 80) {
        System.out.println("A");
      } else if (total < 80 && total >= 65) { 
        System.out.println("B");
      } else if (m == -1 || f == -1) {
        System.out.println("F");
      } else if (total < 65 && total >= 50) {
        System.out.println("C");
      } else if (total < 50 && total >= 30 && r < 50) {
        System.out.println("D");
      } else if (total < 50 && total >= 30 && r >= 50) {
        System.out.println("C");
      } else {
        System.out.println("F");
      }
    }
  }
}
