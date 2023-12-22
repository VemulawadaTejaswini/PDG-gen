import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int a[] = new int[N];
    int b[] = new int[N];
    int M = 0;
    
    for (int i = 0; i < N; i++){
      a[i] = scan.nextInt();
    }
    
    for(int i = N; i > 0; i--){
      int Bc = 0;
      for(int j = N/i; j > 1; j--){
        Bc += b[(i*j)-1];
      }
      b[i-1] = (a[i-1]+Bc)%2;
      M += b[i-1];
    }
    
    System.out.println(M);
    for(int i = 0; i < N; i++){
      if(b[i] == 1){
        System.out.print((i+1) + " ");
      }
    }
  }
}