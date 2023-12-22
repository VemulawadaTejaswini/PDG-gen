import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    if (B == 1) {
      System.out.println(0);
      return;
    }

    int i = A;
    int count = 1;
    while (i < B) {
      i += A - 1;
      count++;
    }
    
    System.out.println(count);
  }
}