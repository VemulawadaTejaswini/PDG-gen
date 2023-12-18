import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    for (int i=0; i<3; i++) {
      a += sc.nextInt();
    }
    
    if (a>21) {
      System.out.println("bust");
    }
    else {
      System.out.println("win");
    }
  }
}
