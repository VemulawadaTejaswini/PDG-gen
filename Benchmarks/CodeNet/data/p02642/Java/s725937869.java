import java.util.*;
 
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> aList = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      pList.add(sc.nextInt());
    }
    
    int cnt = n;
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        if ( i!=j && (aList.get(i) % aList.get(j) == 0) ) {
          cnt--;
          break;
        }
      }
    }
    
    System.out.println(cnt);
  }
}
