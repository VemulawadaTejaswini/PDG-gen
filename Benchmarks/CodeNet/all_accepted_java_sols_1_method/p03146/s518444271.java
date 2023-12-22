import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Set<Integer> memo = new HashSet<>();
    memo.add(a);
    
    for (int i = 2; i < 1000000; i++) {
      a = a % 2 == 0 ? a / 2 : a * 3 + 1;
      if (memo.contains(a)) {
        System.out.println(i);
        break;
      } else {
        memo.add(a);
      }
    }
  }
}