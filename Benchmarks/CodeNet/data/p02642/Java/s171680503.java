import java.util.*;
 
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> aList = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      aList.add(sc.nextInt());
    }
    
    int cnt = n;
    Arrays.sort(aList);
    HashMap<int, boolean> map = new HashMap<int, boolean>();
    
    for (int i=0; i<n; i++) {
      int ai = aList.get(i);
      if (map.contains(ai)) {
        if (map.get(ai)) {
          c--;
        }
        break;
      } else {
        map.put(ai, false);
        for (int j=0; j<n; j++) {
          if ( i!=j && ( % aList.get(j) == 0) ) {
            cnt--;
            map.put(ai, true);
            break;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
