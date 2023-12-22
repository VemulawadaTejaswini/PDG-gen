import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[11];
    num[sc.nextInt()]++;
    num[sc.nextInt()]++;
    num[sc.nextInt()]++;
    String ans = "NO";
    if((num[5] == 2) && (num[7] == 1)) ans = "YES";
    System.out.println(ans);
  }
}