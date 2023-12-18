import java.util.Scanner;

class Main {
  public static void main(String str[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int n = sc.nextInt();
      int s = 0;

      if(n == 0) {
        break;
      }

      while(true) {
        s += (n % 10);
        n /= 10; 

        if(n == 0) {
          break;
        }
      }

      System.out.println(s);
    }
  }
}