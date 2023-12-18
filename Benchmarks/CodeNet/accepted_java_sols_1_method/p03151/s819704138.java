import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    PriorityQueue<Integer> under = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> over = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
      if (B[i] > A[i]) {
        under.offer(B[i]-A[i]);
      } else if (A[i] > B[i]) {
        over.offer(A[i]-B[i]);
      }
    }
    
    int ans = 0;
    int remain = 0;
    while (under.size() > 0) {
      int au = under.poll();
      ans++; 
      while (au > 0) {
        if (remain == 0) {
          if (over.size() == 0) {
            break;
          }
          int ao = over.poll();
          remain = ao;
          ans++;
        }
        int dec = Math.min(au, remain);
        au -= dec;
        remain -= dec;
      }
      if (au > 0) {
        ans = -1;
        break;
      }
    }
    System.out.println(ans);
  }
}