import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long k = sc.nextLong();
      long[] sumA = new long[n];
      int idxA = -1;
      for(int i = 0; i < n; i++) {
        if(i == 0)
          sumA[i] = sc.nextLong();
        else
          sumA[i] = sumA[i-1] + sc.nextLong();
        if(sumA[i] <= k)
          idxA = i;
      }

      int idxB = -1;
      long[] sumB = new long[m];
      for(int i = 0; i < m; i++) {
        if(i == 0)
          sumB[i] = sc.nextLong();
        else
          sumB[i] = sumB[i-1] + sc.nextLong();
        if(sumB[i] <= k)
          idxB = i;
      }

      long max = Math.max(idxA, idxB) + 1;
      int j = 0;
      for(int i = idxA; i >= 0; i--) {
        while(j <= idxB && k - sumA[i] >= sumB[j]) {
          max = Math.max(max, i + 1 + j + 1);
          j++;
        }
      }

      System.out.println(max);
  }
}