import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] AB = new int[N][2];
    for (int i = 0; i < N; i++) {
      AB[i][0] = sc.nextInt();
      AB[i][1] = sc.nextInt();
    }
    
    Arrays.sort(AB, (i, j) -> {
      return i[0] - j[0];
    });
    
    long pay = 0;
    int remain = M;
    for (int i = 0; i < N ; i++) {
      int price = AB[i][0];
      int count = AB[i][1];
      if (remain - count > 0) {
        pay += ((long) count*price);
        remain -= count;
      } else {
        pay += ((long) remain*price);
        break;
      }
    }

    System.out.println(pay);
  }
}