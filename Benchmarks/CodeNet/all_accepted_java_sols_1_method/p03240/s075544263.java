import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[N+1];
    int[] y = new int[N+1];
    int[] h = new int[N+1];
    int[] Hc = new int[N+1];
    int maxh =0;
    for (int i =1; i<N+1; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      h[i] = sc.nextInt();
      maxh = Math.max(h[i],maxh);
    }
    int Cx =0; int Cy =0; int H =0; int count =0; int count2 =0;
    for (int i =0; i<101; i++) {
      for (int j =0; j<101; j++) {
        for (int k =1; k<N+1; k++) {
          if (h[k] ==0) {
            Hc[k] =0;
          } else {
            Hc[k] = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j);
            H = Hc[k];
          }
        }
        for (int k =1; k<N; k++) {
          if (Hc[k] == H || Hc[k] ==0) count++;
        }
        if (count == N-1) {
          Cx = i;
          Cy = j;
          for (int k =1; k<N+1; k++) {
            if (h[k] == Math.max(H - Math.abs(x[k] - Cx) - Math.abs(y[k] - Cy),0)) {
              count2++;
            }
          }
          if (count2 == N) {
            System.out.println(Cx + " " + Cy + " " + H);
            return;
          }
          count2 =0;
        }
        count =0;
      }
    }
  }
}