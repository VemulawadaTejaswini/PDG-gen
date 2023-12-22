import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int minus = 0;
    int index = 0;
    int z = 100000;
    int sum = 0;
    int m1 = 0;
    ArrayList<Integer> listp = new ArrayList<Integer>();
    ArrayList<Integer> listm = new ArrayList<Integer>();
    int[] mm = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
      if(a[i] < 0) {
        minus++;
        m1 += a[i];
        listm.add(i);
        mm[i] = 1;
      } else {
        listp.add(i);
      }
      if(Math.abs(a[i]) < z) {
        index = i;
        z = Math.abs(a[i]);
      }
    }
    if(minus == 0) {
      System.out.println(sum - 2 * a[index]);
      if(n == 2) {
        System.out.println(a[1 - index] + " " + a[index]);
      } else {
        int t = a[index];
        int p = 0;
        for(int i = 0; i < n; i++) {
          if(i == index) {
            
          } else {
            if(p == n - 1) {
              
            } else if(p == n - 2) {
              System.out.println(a[i] + " " + t);
            } else {
              System.out.println(t + " " + a[i]);
              t -= a[i];
            }
            p++;
          }
        }
      }
    } else if(minus == n) {
      System.out.println(2 * a[index] - sum);
      int t = a[index];
      for(int i = 0; i < n; i++) {
        if(i == index) {
        } else {
          System.out.println(t + " " + a[i]);
          t -= a[i];
        }
      }
    } else {
      System.out.println(sum - 2 * m1);
      int t = a[listm.get(0)];
      for(int i = 0; i < listp.size(); i++) {
        if(i == listp.size() - 1) {
          System.out.println(a[listp.get(i)] + " " + t);
          t = a[listp.get(i)] - t;
        } else {
          System.out.println(t + " " + a[listp.get(i)]);
          t -= a[listp.get(i)];          
        }
      }
      for(int i = 1; i < listm.size(); i++) {
        System.out.println(t + " " + a[listm.get(i)]);
        t -= a[listm.get(i)];
      }
    }
  }
}