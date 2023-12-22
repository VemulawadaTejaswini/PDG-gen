import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    int ans = 0;

    for(int i=0; i<n; ++i)
      p[i] = sc.nextInt();

    for(int i=2; i<n; ++i) {
      if( p[i-1] < p[i-2] & p[i-1] < p[i]
         || p[i-1] > p[i-2] & p[i-1] > p[i]) {
        continue;
      }
      ++ans;
    }

    System.out.println(ans);
  }
}