import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];

    for (int i=0; i<n; i++){
      a[i] = scanner.nextInt();
    }
    for (int i=0; i<m; i++){
      b[i] = scanner.nextInt();
    }

    int ans = 0;
    int sum = 0;
    int sum_a = 0;

    for(int i=0; i<n ; i++){
      sum_a += a[i];
      sum = sum_a;
      int tmp = i+1;
      int j = 0;
      while(j<m && sum <= k){
        if(sum + b[j] <= k){
          sum += b[j];
          j++;
          tmp++;
        }else{
          break;
        }
      }
      if(sum > k){
        break;
      }
      ans = Math.max(ans, tmp);

    }
    
    System.out.println(ans);
    
    scanner.close();
    return;
  }
  
}
