import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int a[] = new int[N];
    long total = 0;
    int count = 0;
    for(int i=0; i<N; i++) {
      a[i] = sc.nextInt();
      total += a[i];
    }
    Arrays.sort(a);
    if(x==total) {
      System.out.println(N);
    } else if(x>total) {
      System.out.println(N-1);
    } else {
      for(int j=0; j<N; j++){
        if(x>=a[j]){
          x -= a[j];
          count++;
        } else {
          break;
        }
      }
      System.out.println(count);
    }    
  }
}