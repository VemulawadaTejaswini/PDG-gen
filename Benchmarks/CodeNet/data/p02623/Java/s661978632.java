import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n];
    long[] b = new long[m];
    
    for(int i = 0; i < n; i++)
      a[i] = sc.nextLong();
    
    for(int i = 0; i < m; i++)
      b[i] = sc.nextLong();
    
    int i = 0, j = 0, count = 0;
    long total = 0;
    while((i < n || j < m) && total < k) {
      long temp = 0;
      if(i >= n && j < m) {
        temp = b[j];
        j++;
      } else if(j >= m && i < n) {
        temp = a[i];
        i++;
      } else {
        if(a[i] < b[j]) {
          temp = a[i];
           i++;
        }else {
          temp = b[j];
               j++;
        }
      }
      // System.out.println(temp);
      if(total + temp <= k) {
          total += temp;
          count++;
        } else {
          break;
        }
    }

    System.out.println(count);
  }
}
