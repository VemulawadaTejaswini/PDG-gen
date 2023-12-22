import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(), K = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<>();
      for (int i=0; i<N; i++) {
        list.add(sc.nextInt());
      }
      Collections.sort(list);
      int ans = 0;
      for (int j=0; j<K; j++) {
        ans += list.get(j);
      }
      System.out.println(ans);
    }
}