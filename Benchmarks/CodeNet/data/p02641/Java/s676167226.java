import java.util.*;
 
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    ArrayList<Integer> pList = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      pList.add(sc.nextInt());
    }
    // Arrays.sort(pList);
    
    int number;
    for (int i=0; ; i++) {
      number = x - i;
      if (!pList.contains(number)) {
        System.out.println(number);
        return;
      }
      number = x + i;
      if (!pList.contains(number)) {
        System.out.println(number);
        return;
      }
    }
  }
}
