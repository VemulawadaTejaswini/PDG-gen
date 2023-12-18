import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();

    sc.close();

    // パターン1：ty -> txへ移動する
    for (int i = 0; i < ty - sy; i++){
      System.out.print("U");
    }

    for (int i = 0; i < tx - sx; i++) {
      System.out.print("R");
    }

    // パターン2：sy -> sxへ移動する
    for (int i = 0; i < ty - sy; i++){
      System.out.print("D");
    }

    for (int i = 0; i < tx - sx; i++) {
      System.out.print("L");
    }

    // パターン3：sx-1 -> ty+1 -> tx -> tyへ移動する
    System.out.print("L");

    for (int i = 0; i < ty - sy + 1; i++){
      System.out.print("U");
    }

    for (int i = 0; i < tx - sx + 1; i++) {
      System.out.print("R");
    }

    System.out.print("D");

    // パターン4：tx+1 -> sy-1 -> sx -> syへ移動する
    System.out.print("R");

    for (int i = 0; i < ty - sy + 1; i++){
      System.out.print("D");
    }

    for (int i = 0; i < tx - sx + 1; i++) {
      System.out.print("L");
    }

    System.out.print("U");

    System.out.println("");
    

  }

}