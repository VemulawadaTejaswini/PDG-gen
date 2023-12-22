import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    ArrayList<Long> list = new ArrayList<Long>();
    for (int i=0; i<N; i++) {
      long h = sc.nextLong();
      list.add(h);
    }
    int ans = 0;
    int[] array = new int [N];
    for (int i=N-2; 0 <= i; i--) {
      if (list.get(i) >= list.get(i+1)) {
        array[i] =  array[i+1] + 1; 
        ans = Math.max(ans,array[i]);
      } 
    }
    
    System.out.println(ans);

  }
}