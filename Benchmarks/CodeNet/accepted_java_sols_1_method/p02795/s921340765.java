import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int longSide = Math.max(sc.nextInt(),sc.nextInt());
    int N = sc.nextInt();
    System.out.println(N%longSide == 0 ? N/longSide : N/longSide + 1);
  }
}