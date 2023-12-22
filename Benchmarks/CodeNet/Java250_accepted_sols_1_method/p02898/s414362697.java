import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int limit = Integer.parseInt(sc.next());
    int[] member = new int[n];
    int count = 0;
    for(int i = 0; i < n; i++) {
      member[i] = Integer.parseInt(sc.next());
      if(member[i] >= limit) count++;
    }
    System.out.println(count);
  }
}
