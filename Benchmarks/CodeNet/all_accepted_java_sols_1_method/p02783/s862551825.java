import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int A = sc.nextInt();
    int ans = H / A;
    if((H % A) != 0) {
      ans = ans + 1;
    }

    System.out.println(ans);
  }
}