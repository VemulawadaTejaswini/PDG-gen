import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    sc.close();
 
    // First Forward
    for(int i = sx; i < tx; ++i) {
      System.out.print("R");
    }
    for(int i = sy; i < ty; ++i) {
      System.out.print("U");
    }
 
    // First Return
    for(int i = sx; i < tx; ++i) {
      System.out.print("L");
    }
    for(int i = sy; i < ty; ++i) {
      System.out.print("D");
    }
 
    // Second Forward
    System.out.print("D");
    for(int i = sx; i <= tx; ++i) {
      System.out.print("R");
    }
    for(int i = sy; i <= ty; ++i) {
      System.out.print("U");
    }
    System.out.print("L");
 
    // Second Return
    System.out.print("U");
    for(int i = sx; i <= tx; ++i) {
      System.out.print("L");
    }
    for(int i = sy; i <= ty; ++i) {
      System.out.print("D");
    }
    System.out.print("R\n");
 
  }
}
