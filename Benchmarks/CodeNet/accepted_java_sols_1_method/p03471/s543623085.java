import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    for (int i = 0; i <= N  && i*10000 <= Y; i++) {
      for (int j = 0; i+j <= N && i*10000 + j*5000 <= Y; j++) {
        int remain = Y - (i*10000 + j*5000);
        if (remain / 1000 == N - (i+j)) {
          System.out.println(i + " " + j + " " + remain / 1000);
          return;
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}