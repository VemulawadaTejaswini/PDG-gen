import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] h = new int[n];
    int[] DP = new int[n];
    Arrays.fill(DP,Integer.MAX_VALUE);

    for(int i=0; i<n; i++){
      h[i] = sc.nextInt();
    }

    DP[0] = 0;
    DP[1] = Math.abs(h[1] -h[0]);

    for(int i=2; i<n; i++){
      for(int j=1; j<=k;j++){
        DP[i] = Math.min(DP[i],DP[i-j]+Math.abs(h[i]-h[i-j]));
        if(i-j==0){break;}
      }

    }

    System.out.println(DP[n-1]);

  }
}