import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int min = Integer.parseInt(sc.next());
    int cnt = 1;
    for (int i = 1; i < n; i++) {
      int pi = Integer.parseInt(sc.next());
      if (pi <= min) {
        min = pi;
		cnt++;
      }
    }
    System.out.println(cnt);
  }
}