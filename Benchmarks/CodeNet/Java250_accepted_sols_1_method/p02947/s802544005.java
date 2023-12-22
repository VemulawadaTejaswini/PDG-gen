import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    long N = sc.nextInt();
    ArrayList<String> list = new ArrayList<String>();
    for (int i=0; i<N; i++) {
      char[] c = sc.next().toCharArray();
      Arrays.sort(c);
      String s = new String(c);
      list.add(s);
    }
    Collections.sort(list);
    long ans = 0;
    long count = 1;
    
    for (int i=0; i<N-1; i++) {
      if (list.get(i).equals(list.get(i+1))) {
        count++;
        if (i == N-2) {
          ans += count*(count-1)/2;
        }
      }
      else {
        ans += count*(count-1)/2;
        count = 1;
      }
      
    }
    
    System.out.println(ans);
    
  }
}