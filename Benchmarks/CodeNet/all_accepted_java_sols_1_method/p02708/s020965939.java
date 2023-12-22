import java.util.*;
public class Main {

  public static void main(String[] args) { 
      int mod = 1_000_000_007;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();

      long leftSum = 0;
      long leftIdx = 0;
      while(leftIdx < k) {
        leftSum += leftIdx;
        leftIdx++;
      }
      
      long rightSum = 0;
      long rightIdx = n;
      while(rightIdx > n - k) {
        rightSum += rightIdx;
        rightIdx--;
      }

      long cnt = (rightSum - leftSum + 1) % mod;
      
      int t = k + 1;
      while(t <= n+1) {
        leftSum += leftIdx; leftIdx++;
        rightSum += rightIdx; rightIdx--;

        cnt += (rightSum - leftSum + 1) % mod;
        t++;
      }
      System.out.println(cnt % mod);
  }
}