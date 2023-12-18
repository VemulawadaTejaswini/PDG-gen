import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    double d_d = d;
    int[] x = new int[n];
    int[] y = new int[n];
    int ans = 0;

    for(int i = 0; i< n; i++){
      x[i] = scanner.nextInt();
      y[i] = scanner.nextInt();
    }

    for(int i = 0; i< n; i++){
      if(Math.sqrt(Math.pow(Long.valueOf(x[i]),2) + Math.pow(Long.valueOf(y[i]),2)) <= d_d){
        ans += 1;
      }
    }

    System.out.println(ans);
    
    
    scanner.close();
    return;
  }
  
}
