import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = Long.parseLong(sc.next());
    
    long n = (long)Math.ceil(Math.sqrt(N));

    for (long i = n; i > 0; i--) {
      if (N % i == 0) {
        System.out.println(i + (N/i) - 2);
        return;
      }
    }
  }
}