import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int happy = 0;
    int change = 0;
    while (change+500 <= x) {
      happy += 1000;
      change += 500;
    }
    while (change+5 <= x) {
      happy += 5;
      change += 5;
    }
    System.out.println(happy);
    sc.close();
  }
}