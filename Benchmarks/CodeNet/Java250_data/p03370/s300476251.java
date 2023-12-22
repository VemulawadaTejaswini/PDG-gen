import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int powder = sc.nextInt();
    int[] donuts = new int[num];
    for (int i = 0; i < num; i++) {
      donuts[i] = sc.nextInt();
      powder -= donuts[i];
    }
    Arrays.sort(donuts);
    System.out.println(num + powder / donuts[0]);
    
  }
}