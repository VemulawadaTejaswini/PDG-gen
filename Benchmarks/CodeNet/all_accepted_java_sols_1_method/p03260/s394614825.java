import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int A = sc.nextInt();
      int B = sc.nextInt();
      if (A % 2 == 0 || B % 2 == 0) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }
  }
}
