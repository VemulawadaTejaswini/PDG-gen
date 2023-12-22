import java.util.*;

public class Main {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int[] ip = new int[5];
    int count = 0;
    int sur = 10;
    int a;
    for (int i = 0; i < 5; i++) {
      a = in.nextInt();
      if (a % 10 < sur && a % 10 != 0) sur = a % 10;
      if (a % 10 != 0) count++;
      ip[i] = a / 10;
    }
    a = (count - 1) * 10 + sur;
    for (int n : ip) {
      a += n * 10;
    }
    System.out.println(a);
  }
}