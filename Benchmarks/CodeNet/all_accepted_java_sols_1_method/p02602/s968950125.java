import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n+1];
    a[0] = 0;
    for(int j = 1; j <= n; j++) {
      a[j] = sc.nextInt();
    }

    String[] YorNo = new String[n-k];
    for(int i = k+1; i <= n; i++) {
      if(a[i] > a[i-k]) YorNo[i-k-1] = "Yes";
      else YorNo[i-k-1] = "No";
    }

    for(int m = 0; m < n-k; m++) {
      System.out.println(YorNo[m]);
    }
  }
}