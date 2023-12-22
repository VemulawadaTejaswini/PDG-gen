import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N,sa = 0;
    ArrayList<Integer> L = new ArrayList<Integer>();
    N = s.nextInt();
    for(int i = 0; i < N ;i++){
      L.add(s.nextInt());
    }
    Collections.sort(L);
    sa = L.get(N - 1) - L.get(0);
    System.out.printf("%d",sa);
  }
}