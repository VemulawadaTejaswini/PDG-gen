import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    int[] p = new int[n];
    ArrayList<String> list = new ArrayList<String>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for(int i = 0; i < n; i++) {
      s[i] = sc.next();
      p[i] = sc.nextInt();
      if(!(list.contains(s[i]))) list.add(s[i]);
      map.put(p[i], i);
    }

    Collections.sort(list);
    for(int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      ArrayList<Integer> list3 = new ArrayList<Integer>();
      for(int j = 0; j < n; j++) {
        if(str.equals(s[j])) {
          list2.add(j);
          list3.add(p[j]);
        }
      }
      Collections.sort(list3);
      for(int j = list3.size() - 1; j >= 0; j--) {
        System.out.println(map.get(list3.get(j)) + 1);
      }
    }    
  }
}
