import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int prime = Integer.parseInt(sc.next());

    if (prime == 2) {
      System.out.println(prime);
      return;
    }

    if (prime % 2 == 0) {
      prime++;
    }
    
    while (true) {
      for (int i = 3; ; i+=2) {
        if (prime % i == 0) {
          prime += 2;
          break;
        }
        
        if (i > prime / 2) {
          System.out.println(prime);
          return;
        }
      }
    }
  }
}