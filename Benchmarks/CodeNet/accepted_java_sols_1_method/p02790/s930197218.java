import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a < b) {
      for(int n = 0;n < b; n++) {
        System.out.print(a);
      }
    } else {
      for(int n = 0;n < a; n++) {
        System.out.print(b);
      }
    }
  }
}