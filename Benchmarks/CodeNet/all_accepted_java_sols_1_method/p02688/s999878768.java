import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      Set<Integer> sets = new HashSet<>();
      while(k-- > 0) {
        int d = sc.nextInt();
        for(int i = 0; i < d; i++)
          sets.add(sc.nextInt());
      }

      System.out.println(n - sets.size());
  }
}