import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int N = sc.nextInt();
    Set<Integer> p = new HashSet<Integer>();
    for (int i =0; i<N; i++) {
      p.add(sc.nextInt());
    }
    int i =1, ans =0;
    if (N ==0) {
      ans =X;
    } else {
      while (true) {
        if (!p.contains(X-i)) {
          ans = X -i;
          break;
        }
        if (!p.contains(X+i)) {
          ans = X +i;
          break;
        }
        i++;
      }
    }
   System.out.println(ans);
  }
}