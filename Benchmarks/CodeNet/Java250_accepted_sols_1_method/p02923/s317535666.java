import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H[] = new int[N];
    int C = 0;
    int c = 0;
    H[0] = sc.nextInt();
    
    for(int i=1; i<N; i++) { 
      H[i] = sc.nextInt();
      if(H[i] <= H[i-1]) {
        c++;
      } else {
        c = 0;
      }
      if(C < c) {
        C = c;
      }
    }

    System.out.println(C);
  }
}