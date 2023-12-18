import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (a > b && a > c) {
        if(a*a == b*b + c*c) {
          System.out.println("YES");
          continue;
        }
      }
      else if(b > a && b > c) {
        if(b*b == a*a + c*c) {
          System.out.println("YES");
          continue;
        }
      }
      else if(c > a && c > b) {
        if(c*c == a*a + b*b) {
          System.out.println("YES");
          continue;
        }
      }
      System.out.println("NO");
    }    
  }
}