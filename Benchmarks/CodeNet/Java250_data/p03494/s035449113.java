import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    for(int i=0; i<n; i++) {
      A[i] = sc.nextInt();
    }
    boolean flag = true;
    int cnt = 0;
    
    while(flag) {
      for(int i=0; i<n; i++) {
        if(A[i] % 2 == 0) {
          A[i] /= 2;
        } else {
          flag = false;
        }
      }
      if(flag) {
      	cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}