import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    int T =sc.nextInt();
    int A =sc.nextInt();
    int[] H = new int[N];
    double mindelta = Double.MAX_VALUE;
    int ans=0;
    for(int i=0; i<N;i++){
      H[i]=sc.nextInt();
      double temp = T- H[i]*0.006;
      double delta = Math.abs(A-temp);
      if (mindelta>delta){
        mindelta=delta;
        ans=i;
      }
    }
    System.out.println(ans+1);

  }
}
