import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Integer, ArrayList> map1 = new HashMap<Integer, ArrayList>();
    HashMap<Integer, ArrayList> map2 = new HashMap<Integer, ArrayList>();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      if(map2.containsKey(a[i])) {
        ArrayList<Integer> list = map2.get(a[i]);
        list.add(i);
        map2.put(a[i], list);
      } else {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(i);
        map2.put(a[i], list);
      }
    }
    Arrays.sort(a);
    for(int i = 0; i < n; i++) {
      if(map1.containsKey(a[i])) {
        ArrayList<Integer> list = map1.get(a[i]);
        list.add(i);
        map1.put(a[i], list);
      } else {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(i);
        map1.put(a[i], list);
      }
    }

    int odd = 0;
    int even = 0;

    for(int key : map1.keySet()) {
      ArrayList<Integer> list1 = map1.get(key);
      ArrayList<Integer> list2 = map2.get(key);
 
      int odd1 = 0;
      int even1 = 0;

      int odd2 = 0;
      int even2 = 0;

      for(int i = 0; i < list1.size(); i++) {
        int c = list1.get(i);
        if(c % 2 == 0) {
          even1++;
        } else {
          odd1++;
        }
      }

      for(int i = 0; i < list2.size(); i++) {
        int c = list2.get(i);
        if(c % 2 == 0) {
          even2++;
        } else {
          odd2++;
        }
      }

      if(odd2 > odd1) {
        odd += (odd2 - odd1);
      } else if(even2 > even1) {
        even += (even2 - even1);
      }
    }

    int ans = Math.max(odd, even);
    System.out.println(ans);
  }
}