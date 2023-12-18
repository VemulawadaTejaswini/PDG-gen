import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    a[0] = 1;
    for(int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    long ans = 0;
    int max = a[1];
    for(int i = 2; i <= n; i++) {
      if(max > a[i]) {
        ans += (max-a[i]);
      }else{
        max = a[i];
      }
    }

    System.out.println(ans);
  }
}
