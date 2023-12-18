import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt(), K=sc.nextInt();
    int h[] = new int[N];
    for(int j=0; j<N; j++) {
      h[j] = sc.nextInt();
    }
    Arrays.sort(h);
    int min = h[N-1] - h[0];
    for(int i=0; i<N-K+1; i++) {
      int s = h[i+K-1] - h[i];
      if(min>s) {
        min = s;
      }
    }
    System.out.println(min);
  }
}