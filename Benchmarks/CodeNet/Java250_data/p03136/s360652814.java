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
    
    int sum = 0;
    int max = 0;
    for (int i = 0; i < N; i++) {
      sum += L[i];
      if (L[i] > max) {
        max = L[i];
      }
    }
    
    sum = sum - max;
    if (sum > max) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}