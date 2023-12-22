import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long ans = 0;
    long[] p = new long[n+1];
    for (int i =1; i<=n; i++){
      
      for(int j =i; j<=n; j+=i){
        p[j] += 1;
      }
      ans += p[i] * i;
    }
    System.out.println(ans);
    
    scanner.close();
    return;
  }
}
