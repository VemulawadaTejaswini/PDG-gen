import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int A = sc.nextInt();
      int B = sc.nextInt();

      System.out.println((A-1)*(B-1));
    }
  }
}
