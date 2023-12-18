import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = Integer.valueOf(in.nextLine());
    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      a.add(in.nextInt());
    }
    Collections.sort(a);
    
    int comfort = 0;
    for (int i = n - 2; i >= 0; i--) {
      comfort += a.get(i + 1);
    }
    System.out.println(comfort);
  }
}