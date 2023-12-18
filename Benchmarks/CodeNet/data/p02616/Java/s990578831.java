
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[] a = new long[n];
    int zero = 0;
    ArrayList<Long> list1 = new ArrayList<Long>();
    ArrayList<Long> list2 = new ArrayList<Long>();
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      if(a[i] >= 0) {
        list1.add(a[i]);
      } else {
        list2.add(a[i]);
      }
      if(a[i] == 0) zero++;
    }
    Collections.sort(list1);
    Collections.sort(list2);
    long ans = 1;
    int p1 = list1.size() - 1;
    int p2 = 0;
    if(list1.size() == 0) {
      if((k % 2) == 1) {
        for(int i = list2.size() - 1; i >= list2.size() - k; i--) {
          long d = list2.get(i);
          d += MOD;
          ans = (ans * d) % MOD;
        }
      } else {
        for(int i = 0; i < k; i++) {
          long d = list2.get(i);
          d += MOD;
          ans = (ans * d) % MOD;
        }
      }
    } else if(list2.size() == 0) {
      for(int i = list1.size() - 1; i >= list1.size() - k; i--) {
        ans = (ans * list1.get(i)) % MOD;
      }
    } else {
      if(k == n) {
        for(int i = 0; i < n; i++) {
          if(a[i] >= 0) {
            ans = (ans * a[i]) % MOD;
          } else {
            long d = a[i] + MOD;
            ans = (ans * d) % MOD;
          }
        }
      } else {
        if((list1.size() + list2.size() - zero) > k) {
          int p1 = list1.size() - 1;
          int p2 = 0;
          if((k % 2) == 0) {
            for(int i = 0; i < k; i++) {
              if(p1 >= 0) {
                if(i == (k - 1)) {
                  ans = (ans * list1.get(p1)) % MOD;
                  p1--;
                } else {
                  if(p2 == (list2.size() - 1)) {
                    ans = (ans * list1.get(p1)) % MOD;
                    p1--;
                  } else {
                    long t1 = list1.get(p1);
                    if(p1 > 0) t1 *= list1.get(p1 - 1);
                    long t2 = list2.get(p2) * list2.get(p2 + 1);
                    if(t1 >= t2) {
                      ans = (ans * list1.get(p1)) % MOD;
                      p1--;
                    } else {
                      ans = (ans * t2) % MOD;
                      i++;
                      p2 += 2;
                    }
                  }
                }
              } else {
                long d = list2.get(p2) + MOD;
                ans = (ans * d) % MOD;
                p2++;
              }
            }
          } else {
            ans = list1.get(p1);
            
          }
        } else if((list1.size() + list2.size() - zero) == k) {
          if((list2.size() % 2) == 0) {
            for(int i = 0; i < list2.size(); i++) {
              long d = a[i] + MOD;
              ans = (ans * d) % MOD;
            }
            for(int i = 0; i < list1.size(); i++) {
              ans = (ans * list1.get(i)) % MOD;
            }
          } else {
            ans = 0;
          }
        } else {
          ans = 0;
        }
      }
    }
    System.out.println(ans);
  }
}