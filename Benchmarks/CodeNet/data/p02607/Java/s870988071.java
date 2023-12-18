import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int count = 1;
    int kisu = 0;
    while (n >= count) {
      int a = sc.nextInt();
      list.add(a);
      if (a % 2 != 0 && count % 2 != 0) {
        kisu = kisu + 1;
      }
      count++;
    }
    System.out.println(kisu);
  }
}