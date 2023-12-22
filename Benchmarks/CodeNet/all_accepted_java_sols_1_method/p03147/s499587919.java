import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] h = new int[N];
    for (int i = 0; i < N; i++) {
      h[i] = Integer.parseInt(sc.next());
    }
    
    int count = 0;
    int sum = 0;
    boolean flag = false;
    while (true) {
      for (int i = 0; i < N; i++) {
        if (h[i] != 0) {
          if (i == 0) {
            count++;
            flag = false;
          } else if (h[i-1] == 0 && flag) {
            count++;
            flag = false;
          }
          h[i]--;
        } else {
          flag = true;
        }
      }
      if (count == 0) {
        System.out.println(sum);
        return;
      }
      sum += count;
      count = 0;
    }
  }
}