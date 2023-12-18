

import java.util.HashMap;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long [] arr = new long[n];
    HashMap<Long,Integer> hm = new HashMap();
    long sum = 0;
    for(int i = 0; i < n; i++) {
      long now = sc.nextLong();
      sum += now;
      if(!hm.containsKey(now))
        hm.put(now,0);
      hm.put(now,hm.get(now)+1);
    }
    int q = sc.nextInt();
    while(q--!=0) {
      long now = sc.nextLong();
      long to = sc.nextLong();
      if(hm.containsKey(now)) {
        sum -= hm.get(now)*now;
        sum += hm.get(now)*to;
      if(!hm.containsKey(to)) {
        hm.put(to,hm.get(now));
      } else {
        hm.put(to,hm.get(to)+hm.get(now));
      }
      hm.remove(now);
      }
      System.out.println(sum);
    }
  }

}
