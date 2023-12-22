import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] A = new int[n];
    for (int i = 0; i < n; i++){
      A[i] = Integer.parseInt(sc.next());
    }
    int ans = Integer.MAX_VALUE;
    int count = 0;
    for (int a: A){
      count = 0;
      while ((a%2) == 0){
        count += 1;
        a /= 2;
      }
      ans = Math.min(ans,count);
    }
    System.out.println(ans);

  }
}
