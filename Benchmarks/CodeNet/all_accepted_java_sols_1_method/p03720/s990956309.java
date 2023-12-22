import java.util.*;
import static java.lang.System.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(in);
    int N = sc.nextInt(), M = sc.nextInt();
    int[] array = new int[N];
    for (int i=0; i<M; i++) {
      int a = sc.nextInt()-1, b = sc.nextInt()-1;
      array[a] += 1;
      array[b] += 1;
    }
    for (int ans : array)
      out.println(ans);
  }
}