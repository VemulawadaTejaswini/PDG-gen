import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[4+1];
    for(int i=0; i<6; i++) {
      int N = sc.nextInt();
      a[N]++;
    }
    for(int i=1; i<=4; i++) {
      if(a[i]>=3) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
