import java.util.*;

class Main {
  public static void main(String[] args) {
    int n, k;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    
    Arrays.sort(arr);
    int res = 0;
    for(int i = 0; i < k; i++)
      res += arr[i];
    
    System.out.println(res);
  }
}
