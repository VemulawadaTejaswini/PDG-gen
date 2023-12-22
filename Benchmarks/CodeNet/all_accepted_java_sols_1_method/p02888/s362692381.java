import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] L = new int[N];
    
    for (int i = 0; i < N; i++) {
      L[i] = Integer.parseInt(sc.next());
    }
    
    Arrays.sort(L);
    
    int count = 0;
    for (int i = 0; i < N-2; i++) {
      for (int j = i+1; j < N-1; j++) {
        int min = j+1;
        int max = N;
        if (L[i] + L[j] <= L[min]) {
          continue;
        }
        int k;
        while (true) {
          k = (min + max) / 2;
          if (L[i] + L[j] > L[k]) {
            min = k;
          } else {
            max = k;
          }
          if (max - min <= 1) {
            break;
          }
        }
        count += min - j;
      }
    }
    
    System.out.println(count);
  }
}