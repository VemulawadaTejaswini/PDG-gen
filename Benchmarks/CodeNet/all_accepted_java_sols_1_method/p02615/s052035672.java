import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i=0; i<N; i++) {
        int num = sc.nextInt();
    	list.add(num);
    }
    Collections.sort(list, Collections.reverseOrder());
    long ans = (long)list.get(0);
    long count = 1;
    int j = 1;
    for (int i=1; i<N-1; i++) {
        ans += list.get(j);
        if (count%2 == 0) {
        	j++;
        }
      	count++;
    }
    System.out.println(ans);
    
  }
}