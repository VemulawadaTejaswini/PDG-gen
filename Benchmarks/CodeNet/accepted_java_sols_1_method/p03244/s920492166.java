import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
    for(int i = 0; i < n ; i++) {
      int v = sc.nextInt();
      if(i % 2 == 0) {
        if(map1.containsKey(v)) {
          map1.put(v, map1.get(v) + 1);
        } else {
          map1.put(v, 1);
        }
      } else {
        if(map2.containsKey(v)) {
          map2.put(v, map2.get(v) + 1);
        } else {
          map2.put(v, 1);
        }
      }
    }
    int m1 = 0;
    int m12 = 0;
    int m2 = 0;
    int m22 = 0;
    int p1 = 0;
    int p2 = 0;
    int k1 = 0;
    int k2 = 0;
    for(int key : map1.keySet()) {
      if(map1.get(key) > m1) {
        m1 = map1.get(key);
        p1 = key;
        k1 = 1;
      } else if(map1.get(key) == m1) {
        k1++;
      }
    }
    for(int key : map2.keySet()) {
      if(map2.get(key) > m2) {
        m2 = map2.get(key);
        p2 = key;
        k2 = 1;
      } else if(map2.get(key) == m2) {
        k2++;
      }      
    }

    for(int key : map1.keySet()) {
      if(map1.get(key) < m1) {
        m12 = Math.max(m12, map1.get(key));
      }
    }
    for(int key : map2.keySet()) {
      if(map2.get(key) < m2) {
        m22 = Math.max(m22, map2.get(key));
      }   
    }
    
    int ans = 0;
    if(p1 == p2) {
      if((k1 == 1) && (k2 == 1)) {
        if(m1 + m22 > m12 + m2) {
          ans = n - (m1 + m22);
        } else {
          ans = n - (m12 + m2);
        }
      } else {
        ans = n - (m1 + m2);
      }
    } else {
      ans = n - (m1 + m2);
    }    
    System.out.println(ans);
  }
}
