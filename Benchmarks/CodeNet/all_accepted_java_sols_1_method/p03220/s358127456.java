import java.util.*;


import java.io.*;

class Main {

  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int T = sc.nextInt();
      int A = sc.nextInt();
      double min = Double.MAX_VALUE;
      int tmp = 0;
      for (int i = 0; i < N; i++) {
        int x = sc.nextInt();
        double tem = T - x * 0.006;
        if (min > Math.abs(tem - A)) {
          min = Math.abs(tem - A);
          tmp = i+1;
        }
      }
      System.out.println(tmp);
    }
  }
}
