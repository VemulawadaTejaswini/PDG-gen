import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int T = scan.nextInt();
    int A = scan.nextInt();
    int H[];
    H = new int[N];
    double ansh = 10000000;
    int ans = 0;
    for (int i = 0;i<H.length ;i++ ) {
        H[i] = scan.nextInt();
    }

    for (int i = 0;i<H.length ;i++ ) {
        if (ansh > Math.abs(A-(T-(double)H[i]*0.006))) {
            ans = i;
            ansh = Math.abs(A-(T-(double)H[i]*0.006));
        }
    }
    System.out.println(ans+1);
  }
}
