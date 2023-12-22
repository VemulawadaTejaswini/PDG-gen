import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int alice =0,bob=0;
    for (int i=0; i<N; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    for (int i=0; i<=(N-1)/2; i++) {
      int tmp = a[i];
      a[i] = a[N-1-i];
      a[N-1-i] = tmp;
    }
    for (int i=0; i<=N-1; i++) {
      if(i % 2 ==0) alice += a[i];
      if(i % 2 ==1) bob += a[i];
    }
    System.out.println(alice - bob);
  }
}