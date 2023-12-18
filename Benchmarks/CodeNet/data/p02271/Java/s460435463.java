import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int A[] = new int[n];
    for(int i = 0; i < n; i++){
      A[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++){
      int m = sc.nextInt();
      int sum = 0;
      for(int j = 0; j < (1 << n); j++){
        sum = 0;
        for(int k =0; k < n; k++){
          if((1 & j>>k) == 1) sum += A[k];
        }
        if(sum == m) break;
      }
      if(sum == m) System.out.println("yes");
      else System.out.println("no");
    }
    sc.close();
  }
}
