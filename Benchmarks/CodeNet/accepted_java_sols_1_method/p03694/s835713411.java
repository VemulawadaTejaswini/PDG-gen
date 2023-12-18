import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = -1;
    int min = 1001;
    for(int i = 0; i < n; i++) {
      int curr = sc.nextInt();
      max = Math.max(curr, max);
      min = Math.min(curr, min);
    }
    System.out.println(max-min);
  }
}
