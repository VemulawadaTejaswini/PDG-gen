import java.util.*;
 
class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
    A[i] = sc.nextInt();
    }
    
    Arrays.sort(A);
   
    boolean flg = true;
    for(int j = 0; j < N-1; j++) {
      if (A[j] == A[j+1]) {
			  flg = false;
			}
		}

    if (flg) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}