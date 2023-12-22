import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    
    for (int i = 0; i <= N; i++) {
      int x = i*10000;
      if (x > Y) break;
      for (int j = 0; j <= N - i; j++) {
        int y = j * 5000;
        if ((x + y) > Y) break;
        if ((Y - x - y) / 1000 == (N - i - j)) {
          System.out.println(i + " " + j + " " + (Y - x - y) / 1000 );
          return; 
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}
  