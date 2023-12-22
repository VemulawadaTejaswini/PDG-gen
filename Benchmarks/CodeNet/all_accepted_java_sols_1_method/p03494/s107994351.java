import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int A[] = new int[n];
    int rc = 0;
    boolean execFlg = true;
    
    for (int i=0;i<n;i++) {
      A[i] = sc.nextInt();
    }
    
    while (execFlg) {      
      for (int j=0;j<n;j++) {
        if (A[j]%2 == 0) {
          A[j] = A[j]/2;
        } else {
          execFlg = false;
          break;
        }
      }
      
      if (execFlg) {
        rc = rc + 1;
      }
    }
    
    System.out.println(rc);
  }
}