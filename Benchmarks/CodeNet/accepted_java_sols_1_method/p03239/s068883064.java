import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int T = sc.nextInt();
      int cost = 1200;
      for (int i = 0; i < N; i++) {
        int c = sc.nextInt();
        int t = sc.nextInt();
        if (t <= T && cost > c) {
          cost = c;
        }
      }
      if (cost == 1200) {
        System.out.println("TLE");
      } else {
        System.out.println(cost);
      }
    }
  }
}
