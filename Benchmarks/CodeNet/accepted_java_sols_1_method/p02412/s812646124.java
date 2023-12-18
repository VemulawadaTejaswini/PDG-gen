import java.util.*;

class Main{
  static int n,x;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n= sc.nextInt();
      int x = sc.nextInt();
      int total = 0;
      int ans = 0;
      if (n == 0 && x == 0) {
        break;
        }
      for (int i =1; i<=n; i++) {
        for (int j =i+1; j> i && j<= n; j++) {
          for (int k = j+1; k>j && k<=n; k++) {
            if (i + j + k == x) {
            total ++;
            }
          }
        }
      }
          System.out.println(total);
    }
  }
}
