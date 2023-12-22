import java.util.*;

class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    while(true){
      int n = sc.nextInt();
      int m = sc.nextInt();
      if (n == 0 && m == 0) return;
      int a[] = new int[n];
      int b[] = new int[m];
      int sumA = 0;
      int sumB = 0;
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        sumA += a[i];
      }
      for (int i = 0; i < m; i++) {
        b[i] = sc.nextInt();
        sumB += b[i];
      }
      
      int minsum = 100000;
      int mini = -1, minj = -1;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if ( (sumA - a[i] + b[j]) == (sumB - b[j] + a[i]) ) {
            if ( (a[i] + b[j]) < minsum) {
              minsum = a[i] + b[j];
              mini = i;
              minj = j;
            }
          }
        }
      }
      
      if (mini == -1)
        System.out.println("-1");
      else
        System.out.println(a[mini] + " " + b[minj]);
    }
  }
}
