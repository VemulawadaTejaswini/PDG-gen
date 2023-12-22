import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      if (String.valueOf(i).length() % 2 == 1) {
        sum++;
      }
    }
    
    System.out.println(sum);
  }
}